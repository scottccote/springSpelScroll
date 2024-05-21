package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;
import com.coteware.springscroll3.script.expresions.Expression;

public interface Statement {
    void execute();

    default ScopeMemory newScopeMemory(ScopeMemory scopeMemory) {
        return new ScopeMemory(scopeMemory);
    }

    default void add(Expression build) {

    }
}
