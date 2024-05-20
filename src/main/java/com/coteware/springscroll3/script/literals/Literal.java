package com.coteware.springscroll3.script.literals;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public interface Literal<T> {
    T getValue();
    DataTypeEnum getDataType();
}
