package com.coteware.springscroll.script;

public class UnitResult {
    private final ScopeMemory scopeMemory;

    public UnitResult(ScopeMemory scopeMemory) {
        this.scopeMemory = scopeMemory;
    }

    public ScopeMemory getScopeMemory() {
        return scopeMemory;
    }
}
