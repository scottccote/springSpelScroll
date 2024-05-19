package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;

public class EndStatement extends AbstractStatement {

    private final BeginStatement beginStatement;

    private EndStatement(ScopeMemory scopeMemory) {
        super(scopeMemory);
        this.beginStatement = null;
        throw new UnsupportedOperationException();
    }

    public EndStatement(ScopeMemory scopeMemory,BeginStatement beginStatement) {
        super(scopeMemory);
        this.beginStatement = beginStatement;
    }

    @Override
    public void execute() {
        getScopeMemory().clear();
    }
}
