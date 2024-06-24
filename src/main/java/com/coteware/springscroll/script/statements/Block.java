package com.coteware.springscroll.script.statements;

import com.coteware.springscroll.script.ScopeMemory;
import com.coteware.springscroll.script.expresions.ExpressionBuilderFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Block extends AbstractStatement {
    private final ScopeMemory scopeMemory;
    private final ArrayList<Statement> statements = new ArrayList<>();
    private final ExpressionBuilderFactory expressionBuilder = ExpressionBuilderFactory.newInstance();


    public Block(ScopeMemory scopeMemory) {
        super(StatementTypeEnum.BLOCK);
        this.scopeMemory = scopeMemory;
    }

    public ScopeMemory getScopeMemory() {
        return scopeMemory;
    }

    public ExpressionBuilderFactory getExpressionBuilder() {
        return expressionBuilder;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public List<Statement> getStatements() {
        return this.statements;
    }


    public <T extends Statement> T currentStatement() {
        return (T) statements.get(statements.size()-1);
    }
}
