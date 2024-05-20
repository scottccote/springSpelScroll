package com.coteware.springscroll3.script.literals;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public class AbstractLiteral<T> implements Literal<T> {
    private T value;
    private DataTypeEnum dataTypeEnum;

    public AbstractLiteral(T value, DataTypeEnum dataTypeEnum) {
        this.value = value;
        this.dataTypeEnum = dataTypeEnum;
    }

    public T getValue() {
        return value;
    }

    public DataTypeEnum getDataType() {
        return dataTypeEnum;
    }
}
