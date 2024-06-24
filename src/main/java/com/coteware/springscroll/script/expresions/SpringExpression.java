package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.Literal;

import java.util.ArrayList;
import java.util.List;

public class SpringExpression<S,T extends Literal<S>> extends AbstractExpression<S,T> {
    private String literal;

    @Override
    public <Q> void add(Literal<Q> literal) {
        this.literal = literal.toString();
    }

    @Override
    protected ExpressionResult<S, T> doEvaluate() {
        T springResult = evaluateSpringExpression();
        return new ExpressionResult<>(springResult);
    }

    private T evaluateSpringExpression() {
        return null;
    }
}
