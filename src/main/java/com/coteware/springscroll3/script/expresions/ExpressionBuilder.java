package com.coteware.springscroll3.script.expresions;

public class ExpressionBuilder {
    private ExpressionBuilder expressionBuilder;
    private Expression expression;

    public static ExpressionBuilder newInstance() {
        return new ExpressionBuilder();
    }

    public ExpressionBuilder addLogicalExpression(LogicalExpression expression) {
        this.expression = expression;
        return this;
    }

    public ExpressionBuilder addLiteralExpression(LiteralExpression expression) {
        this.expression = expression;
        return this;
    }

    public ExpressionBuilder addSpringExpression(SpringExpression expression) {
        this.expression = expression;
        return this;
    }

    public Expression build() {
        return this.expression;
    }


}
