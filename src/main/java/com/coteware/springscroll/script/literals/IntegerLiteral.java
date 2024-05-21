package com.coteware.springscroll.script.literals;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public class IntegerLiteral extends NumericLiteral<Integer> {

    public IntegerLiteral(Integer value) {
        super(value, DataTypeEnum.INTEGER);
    }

    @Override
    public void negate() {
        setNegative(getValue().intValue() * -1);
    }
}
