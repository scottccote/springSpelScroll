package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;

import java.util.ArrayList;
import java.util.List;

public class BeginStatement extends AbstractStatement {

    private final DeclareStatement declareStatement;

    public BeginStatement(ScopeMemory scopeMemory) {
        super(new ScopeMemory(scopeMemory));
        declareStatement = null;
    }

    public BeginStatement(ScopeMemory scopeMemory, DeclareStatement declareStatement, DeclareStatement declareStatement1) {
        super(scopeMemory);
        this.declareStatement = declareStatement1;
    }


    @Override
    public void execute() {

    }
}
