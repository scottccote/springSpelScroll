package com.coteware.springscroll3.script;

import com.coteware.springscroll3.script.statements.Statement;

import java.util.ArrayList;

public class Block {
    private final ScopeMemory scopeMemory;
    private final ArrayList<Statement> statements = new ArrayList<>();

    public Block() {
        this.scopeMemory = new ScopeMemory();
    }
    public Block(ScopeMemory scopeMemory) {
        this.scopeMemory = scopeMemory;
    }

    public ScopeMemory getScopeMemory() {
        return scopeMemory;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }
}
