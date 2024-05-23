package com.coteware.springscroll.script.statements;

import com.coteware.springscroll.script.ScopeMemory;
import com.coteware.springscroll.script.expresions.Expression;

import java.util.Optional;

public interface Statement {
    void execute();

    default ScopeMemory newScopeMemory(ScopeMemory scopeMemory) {
        return new ScopeMemory(scopeMemory);
    }

    default void add(Expression build) {}

    default Optional<Statement> nextSequencedStatement();
}
