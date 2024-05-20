package com.coteware.springscroll3.script.literals;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public class FloatLiteral extends NumericLiteral<Float> {
    public FloatLiteral(Float value) {
        super(value, DataTypeEnum.FLOAT);
    }
    @Override
    public void negate() {
        setNegative(getValue().floatValue() * -1f);
    }
}
