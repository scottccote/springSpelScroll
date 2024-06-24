package com.coteware.springscroll.script.statements;

import com.coteware.springscroll.script.ScopeMemory;
import com.coteware.springscroll.script.expresions.Expression;

import java.util.Optional;

public interface Statement {
//    StatementResult execute();

    default ScopeMemory newScopeMemory(ScopeMemory scopeMemory) {
        return new ScopeMemory(scopeMemory);
    }

    default void add(Expression build) {}

    Optional<Statement> nextSequenceStatement();

    void setNextSequenceStatement(Statement nextSequenceStatement);

    void execute();
}
