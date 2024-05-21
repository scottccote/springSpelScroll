package com.coteware.springscroll.script.variables;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public interface Variable<T> {
    String getName();
    DataTypeEnum getDataTypeEnum();
    T getValue();
    void setValue(T value);
}
