package com.coteware.springscroll3.antlr;

import com.coteware.antlr.SpelScriptBaseListener;
import com.coteware.antlr.SpelScriptParser;
import com.coteware.springscroll3.script.Block;
import com.coteware.springscroll3.script.ScopeMemory;
import com.coteware.springscroll3.script.Scroll;
import com.coteware.springscroll3.script.declarations.DataTypeEnum;
import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.declarations.DeclarationSpecFactory;
import com.coteware.springscroll3.script.exceptions.ScrollAssemblyException;
import com.coteware.springscroll3.script.expresions.Expression;
import com.coteware.springscroll3.script.expresions.ExpressionBuilder;
import com.coteware.springscroll3.script.literals.Literal;
import com.coteware.springscroll3.script.literals.LiteralFactory;
import com.coteware.springscroll3.script.statements.AssignmentStatement;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class ScrollListener extends SpelScriptBaseListener {


    private List<String> msgs = new ArrayList<>();
    private Deque<Block> blockStack = new ArrayDeque<>();
    private Block currentBlock;

    private LiteralFactory literalFactory = new LiteralFactory();

    public ScrollListener() {
    }

    public List<String> getMsgs() {
        return Collections.unmodifiableList(msgs);
    }

    public SequencedCollection<Block> getBlockStack() {
        return Collections.unmodifiableSequencedCollection(this.blockStack);
    }

    public Optional<Block> getCurrentBlock() {
        return Optional.ofNullable(this.currentBlock);
    }

    private void addMsg(String msg) {
        this.msgs.add(msg);
    }

    @Override
    public void enterScroll(SpelScriptParser.ScrollContext ctx) {
        addMsg("enterScroll");
    }

    @Override
    public void exitScroll(SpelScriptParser.ScrollContext ctx) {
        addMsg("exitScroll");
    }

    @Override
    public void enterBlock(SpelScriptParser.BlockContext ctx) {
        addMsg("enterBlock");
        final ScopeMemory scopeMemory;
        final Block block;
        if (null == blockStack.peek()) {
            block = new Block();
        } else {
            block = new Block(new ScopeMemory(blockStack.peek().getScopeMemory()));
        }
        blockStack.push(block);
    }

    @Override
    public void exitBlock(SpelScriptParser.BlockContext ctx) {
        addMsg("exitBlock");
        currentBlock = blockStack.pop();
    }

    @Override
    public void enterSeq_of_declare_specs(SpelScriptParser.Seq_of_declare_specsContext ctx) {
        addMsg("enterSeq_of_declare_specs");
    }

    @Override
    public void exitSeq_of_declare_specs(SpelScriptParser.Seq_of_declare_specsContext ctx) {
        addMsg("exitSeq_of_declare_specs");
    }

    @Override
    public void enterDeclare_spec(SpelScriptParser.Declare_specContext ctx) {
        addMsg("enterDeclare_spec");
    }

    @Override
    public void exitDeclare_spec(SpelScriptParser.Declare_specContext ctx) {
        addMsg("exitDeclare_spec");
    }


    @Override
    public void enterVariable_declaration(SpelScriptParser.Variable_declarationContext ctx) {
        addMsg("enterVariable_declaration");
    }

    //TODO move to top and make injectable
    private DeclarationSpecFactory declarationSpecFactory = new DeclarationSpecFactory();

    @Override
    public void exitVariable_declaration(SpelScriptParser.Variable_declarationContext ctx) {
        addMsg("exitVariable_declaration");
        String variableName = ctx.getChild(0).getText();
        String variableType = ctx.getChild(1).getText();
        DataTypeEnum dataType = DataTypeEnum.valueOf(variableType);
        DeclarationSpec declarationSpec = declarationSpecFactory.createDeclarationSpec(variableName,dataType);
        this.blockStack.peek().getScopeMemory().add(declarationSpec);
    }

    @Override
    public void enterStatement(SpelScriptParser.StatementContext ctx) {

        addMsg("enterStatement");
    }

    @Override
    public void exitStatement(SpelScriptParser.StatementContext ctx) {

        addMsg("exitStatement");
    }

    @Override
    public void enterAssignment_statement(SpelScriptParser.Assignment_statementContext ctx) {
        addMsg("enterAssignment_statement");
    }

    @Override
    public void exitAssignment_statement(SpelScriptParser.Assignment_statementContext ctx) {
        addMsg("exitAssignment_statement");
        Expression expression = blockStack.peek().getExpressionBuilder().build();
        String variableName = ctx.getChild(0).getText();
        Optional<DeclarationSpec> maybeDeclarationSpec = blockStack.peek().getScopeMemory().get(variableName);
        AssignmentStatement assignmentStatement = new AssignmentStatement();
        if (maybeDeclarationSpec.isPresent()) {
            assignmentStatement.setDeclarationSpec(maybeDeclarationSpec.get());
        } else {
            throw new ScrollAssemblyException("no declaration found for variable " + variableName);
        }
        assignmentStatement.setExpression(expression);
        this.blockStack.peek().addStatement(assignmentStatement);
        blockStack.peek().getExpressionBuilder().reset();
    }

    @Override
    public void enterSeq_of_statements(SpelScriptParser.Seq_of_statementsContext ctx) {
        addMsg("enterSeq_of_statements");
    }

    @Override
    public void exitSeq_of_statements(SpelScriptParser.Seq_of_statementsContext ctx) {
        addMsg("exitSeq_of_statements");
    }

    @Override
    public void enterLiteral(SpelScriptParser.LiteralContext ctx) {
        addMsg("enterLiteral");
    }

    @Override
    public void exitLiteral(SpelScriptParser.LiteralContext ctx) {
        addMsg("exitLiteral");
        ParseTree child = ctx.getChild(0);
        Literal literal = literalFactory.createLiteral(child);
        this.blockStack.peek().getExpressionBuilder().addLiteral(literal);
    }

    @Override
    public void enterNumeric(SpelScriptParser.NumericContext ctx) {
        addMsg("enterNumeric");
    }

    @Override
    public void exitNumeric(SpelScriptParser.NumericContext ctx) {
        addMsg("exitNumeric");
    }

    @Override
    public void enterSpring_expression(SpelScriptParser.Spring_expressionContext ctx) {
        addMsg("enterSpring_expression");
        this.blockStack.peek().getExpressionBuilder().startSpringExpression();
    }

    @Override
    public void exitSpring_expression(SpelScriptParser.Spring_expressionContext ctx) {
        addMsg("exitSpring_expression");

        ScopeMemory scopeMemory = this.blockStack.peek().getScopeMemory();
        int childCount = ctx.getChildCount();
        if (3 < childCount) {
            ExpressionBuilder expressionBuilder = this.blockStack.peek().getExpressionBuilder();
            for (int i = 2; i < childCount - 1; i++) {
                String variableName = ctx.getChild(i).getText();
                Optional<DeclarationSpec> maybeDeclaration = scopeMemory.get(variableName);
                if (maybeDeclaration.isPresent()) {
                    expressionBuilder.addDeclarationSpec(maybeDeclaration.get());
                } else {
                    throw new ScrollAssemblyException("no declaration found for variable " + variableName);
                }
            }
        }
    }

    @Override
    public void exitExpression(SpelScriptParser.ExpressionContext ctx) {
        addMsg("exitExpression");
    }

    @Override
    public void enterExpression(SpelScriptParser.ExpressionContext ctx) {
        addMsg("enterExpression");
    }

    @Override
    public void enterRegular_id(SpelScriptParser.Regular_idContext ctx) {
        addMsg("enterRegular_id");
    }

    @Override
    public void exitRegular_id(SpelScriptParser.Regular_idContext ctx) {
        addMsg("exitRegular_id");
    }

    @Override
    public void exitIdentifier(SpelScriptParser.IdentifierContext ctx) {
        super.exitIdentifier(ctx);
    }
}
