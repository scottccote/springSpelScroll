package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.literals.Literal;

public class LiteralExpressionBuilder<R,S extends Literal<R>> implements ExpressionBuilder<R,S,LiteralExpression<R,S>> {
    private LiteralExpression<R,S> expression = new LiteralExpression<>();

    @Override
    public <Q> LiteralExpressionBuilder<R,S> addLiteral(Literal<Q> literal) {
        this.expression.add(literal);
        return this;
    }

    @Override
    public LiteralExpression<R,S> build() {
        return expression;
    }

    @Override
    public void reset() {
        this.expression = new LiteralExpression<R,S>();
    }
}
