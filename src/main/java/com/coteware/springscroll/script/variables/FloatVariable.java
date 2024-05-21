package com.coteware.springscroll.script.variables;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public class FloatVariable extends AbstractVariable<Float> {
    public FloatVariable(String name) {
        super(name, DataTypeEnum.FLOAT);
    }
}
