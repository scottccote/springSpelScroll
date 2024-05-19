package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;

public class Block extends AbstractStatement {
    private DeclareStatement declareStatement;
    private BeginStatement beginStatement;
    private EndStatement endStatement;

    public Block(ScopeMemory scopeMemory) {
        super(scopeMemory);
    }

    public DeclareStatement getDeclareStatement() {
        return declareStatement;
    }

    public void setDeclareStatement(DeclareStatement declareStatement) {
        this.declareStatement = declareStatement;
    }

    public BeginStatement getBeginStatement() {
        return beginStatement;
    }

    public void setBeginStatement(BeginStatement beginStatement) {
        this.beginStatement = beginStatement;
    }

    public EndStatement getEndStatement() {
        return endStatement;
    }

    public void setEndStatement(EndStatement endStatement) {
        this.endStatement = endStatement;
    }

    @Override
    public void execute() {

    }
}
