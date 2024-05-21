package com.coteware.springscroll.script.variables;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public class IntegerVariable extends AbstractVariable<Integer> {
    public IntegerVariable(String name) {
        super(name, DataTypeEnum.INTEGER);
    }
}
