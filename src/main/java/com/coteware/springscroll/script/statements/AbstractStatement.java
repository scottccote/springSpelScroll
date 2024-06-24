package com.coteware.springscroll.script.statements;

import java.util.Optional;

public abstract class AbstractStatement implements Statement {
    private Statement nextSequenceStatement;
    private final StatementTypeEnum statementType;

    public AbstractStatement(StatementTypeEnum statementType) {
        this.statementType = statementType;
    }

    @Override
    public Optional<Statement> nextSequenceStatement() {
        return Optional.ofNullable(nextSequenceStatement);
    }

    @Override
    public void setNextSequenceStatement(Statement nextSequenceStatement) {
        this.nextSequenceStatement = nextSequenceStatement;
    }

    public StatementTypeEnum getStatementType() {
        return statementType;
    }

    @Override
    public void execute() {
        doExecute();
    }

    protected void doExecute() {

    }
}
