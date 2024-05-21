package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;
import com.coteware.springscroll3.script.expresions.ExpressionBuilderFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Block extends AbstractStatement {
    private final ScopeMemory scopeMemory;
    private final ArrayList<Statement> statements = new ArrayList<>();
    private final ExpressionBuilderFactory expressionBuilder = ExpressionBuilderFactory.newInstance();


    public Block(ScopeMemory scopeMemory) {
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

    public Collection<Statement> getStatements() {
        return Collections.unmodifiableList(this.statements);
    }

    @Override
    public void execute() {

    }

    public <T extends Statement> T currentStatement() {
        return (T) statements.get(statements.size()-1);
    }
}
