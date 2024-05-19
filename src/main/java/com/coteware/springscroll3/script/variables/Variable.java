package com.coteware.springscroll3.script.variables;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public interface Variable<T> {
    String getName();
    DataTypeEnum getDataTypeEnum();
    T getValue();
    void setValue(T value);
}
