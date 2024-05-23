package com.coteware.springscroll.script.statements;

import com.coteware.springscroll.script.expresions.Expression;

import java.util.ArrayList;
import java.util.List;

public class PrintStatement extends AbstractStatement {
    private List<Expression> expressions = new ArrayList<>();
    public PrintStatement() {
        super(StatementTypeEnum.PRINT);
    }

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

//    @Override
//    public StatementResult execute() {
//
//    }

    @Override
    public void add(Expression expression) {
        this.expressions.add(expression);
    }

}
