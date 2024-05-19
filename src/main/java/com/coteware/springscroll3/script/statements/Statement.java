package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;

public interface Statement {
    public void execute();

    public default ScopeMemory newScopeMemory(ScopeMemory scopeMemory) {
        return new ScopeMemory(scopeMemory);
    }
}
