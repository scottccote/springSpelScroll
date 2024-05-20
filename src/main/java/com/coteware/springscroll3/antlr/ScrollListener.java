package com.coteware.springscroll3.antlr;

import com.coteware.antlr.SpelScriptBaseListener;
import com.coteware.antlr.SpelScriptParser;
import com.coteware.springscroll3.script.Scroll;
import com.coteware.springscroll3.script.statements.BeginStatement;
import com.coteware.springscroll3.script.statements.DeclareStatement;
import com.coteware.springscroll3.script.statements.EndStatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScrollListener extends SpelScriptBaseListener {


    private List<String> msgs = new ArrayList<>();

    public ScrollListener() {
    }

    public List<String> getMsgs() {
        return Collections.unmodifiableList(msgs);
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
    }

    @Override
    public void exitBlock(SpelScriptParser.BlockContext ctx) {
        addMsg("exitBlock");
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

    @Override
    public void exitVariable_declaration(SpelScriptParser.Variable_declarationContext ctx) {

        addMsg("exitVariable_declaration");
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
    }

    @Override
    public void exitSpring_expression(SpelScriptParser.Spring_expressionContext ctx) {

        addMsg("exitSpring_expression");
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
}
