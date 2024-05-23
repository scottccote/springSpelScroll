package com.coteware.springscroll.script.statements;

import java.util.Optional;

public abstract class AbstractStatement implements Statement {
    private Statement nextSequenceStatement;
    private final StatementTypeEnum statementType;

    public Optional<Statement> getNextSequenceStatement() {
        return Optional.ofNullable(nextSequenceStatement);
    }

    public void setNextSequenceStatement(Statement nextSequenceStatement) {
        this.nextSequenceStatement = nextSequenceStatement;
    }
}
