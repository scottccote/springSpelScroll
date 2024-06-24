package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DataTypeEnum;
import com.coteware.springscroll.script.literals.Literal;

public class ExpressionResult<S,E extends Literal<S>> {
    private final E literal;
    public ExpressionResult(E literal) {
        this.literal = literal;
    }

    public E getLiteral() {
        return literal;
    }

    public DataTypeEnum getType() {
        return literal.getDataType();
    }
}
