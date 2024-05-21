package com.coteware.springscroll.script.literals;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public interface Literal<T> {
    T getValue();
    DataTypeEnum getDataType();
}
