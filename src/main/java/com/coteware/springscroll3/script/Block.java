package com.coteware.springscroll3.script;

import com.coteware.springscroll3.script.expresions.ExpressionBuilder;
import com.coteware.springscroll3.script.statements.Statement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Block {
    private final ScopeMemory scopeMemory;
    private final ArrayList<Statement> statements = new ArrayList<>();
    private final ExpressionBuilder expressionBuilder = ExpressionBuilder.newInstance();

    public Block() {
        this.scopeMemory = new ScopeMemory();
    }
    public Block(ScopeMemory scopeMemory) {
        this.scopeMemory = scopeMemory;
    }

    public ScopeMemory getScopeMemory() {
        return scopeMemory;
    }

    public ExpressionBuilder getExpressionBuilder() {
        return expressionBuilder;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public Collection<Statement> getStatements() {
        return Collections.unmodifiableList(this.statements);
    }
}
