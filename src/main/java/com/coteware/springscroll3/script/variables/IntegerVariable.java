package com.coteware.springscroll3.script.variables;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public class IntegerVariable extends AbstractVariable<Integer> {
    public IntegerVariable(String name) {
        super(name, DataTypeEnum.INTEGER);
    }
}
