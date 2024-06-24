package com.coteware.springscroll.script.statements;

import com.coteware.springscroll.script.expresions.Expression;
import com.coteware.springscroll.script.expresions.ExpressionResult;

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


    @Override
    public void add(Expression expression) {
        this.expressions.add(expression);
    }

    @Override
    protected void doExecute() {
        expressions.forEach(
                expression -> {
                    ExpressionResult expressionResult = expression.evaluate();
                    System.out.print(expressionResult.getLiteral().getValue());
                    System.out.print(" ");
                }
        );
        System.out.println();
    }
}
