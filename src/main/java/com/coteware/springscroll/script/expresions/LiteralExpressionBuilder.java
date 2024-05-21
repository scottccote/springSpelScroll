package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.literals.Literal;

public class LiteralExpressionBuilder implements ExpressionBuilder {
    private LiteralExpression expression = new LiteralExpression();

    @Override
    public LiteralExpressionBuilder addLiteral(Literal literal) {
        this.expression.add(literal);
        return this;
    }


    @Override
    public Expression build() {
        return expression;
    }



    @Override
    public void reset() {
        this.expression = new LiteralExpression();
    }
}
