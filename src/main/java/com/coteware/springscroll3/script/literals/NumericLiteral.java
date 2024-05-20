package com.coteware.springscroll3.script.literals;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;
import org.springframework.util.NumberUtils;

public abstract class NumericLiteral<T> extends AbstractLiteral<T>{
    private T negativeValue;

    public NumericLiteral(T value, DataTypeEnum dataTypeEnum) {
        super(value, dataTypeEnum);
    }

    public abstract void negate();

    public void setNegative(T negativeValue) {
        this.negativeValue = negativeValue;
    }
}
