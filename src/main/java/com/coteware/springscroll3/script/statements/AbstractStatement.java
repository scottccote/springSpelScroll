package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;

public abstract class AbstractStatement implements Statement {
    private final ScopeMemory scopeMemory;

    public AbstractStatement(ScopeMemory scopeMemory) {
        this.scopeMemory = scopeMemory;
    }

    protected ScopeMemory getScopeMemory() {
        return scopeMemory;
    }
}
