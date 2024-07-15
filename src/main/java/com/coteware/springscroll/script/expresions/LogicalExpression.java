package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.Literal;

public class LogicalExpression <S,T extends Literal<S>> extends AbstractExpression<S,T> {
    private T value;

    private boolean isNull = false;
    private boolean isNot = false;


    @Override
    public <M> void add(Literal<M> literal) {
        value = (T) literal;
    }

    @Override
    public String doEcho() {
        return echoDeclarationSpecMap();
    }

    @Override
    public ExpressionResult<S, T> doEvaluate() {
        return new ExpressionResult<>(value);
    }

    public void setNull() {
        this.isNull = true;
    }
    public boolean isNull() {
        return isNull;
    }

    public void setNot() {
        this.isNot = true;
    }
    public boolean isNot() {
        return isNot;
    }
}
