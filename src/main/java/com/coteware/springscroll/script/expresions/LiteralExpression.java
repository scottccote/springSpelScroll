package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.literals.Literal;

public class LiteralExpression<S,T extends Literal<S>> extends AbstractExpression<S,T>{
    private T value;


    @Override
    public <M> void add(Literal<M> literal) {
        value = (T) literal.getValue();
    }

    @Override
    public ExpressionResult<S, T> doEvaluate() {
        return new ExpressionResult<>(value);
    }

}
