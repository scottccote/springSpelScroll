package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;

public class Block extends AbstractStatement {
    private final ScopeMemory scopeMemory;

    public Block(ScopeMemory scopeMemory) {
        this.scopeMemory = scopeMemory;
    }

    public ScopeMemory getScopeMemory() {
        return scopeMemory;
    }

    @Override
    public void execute() {

    }
}
