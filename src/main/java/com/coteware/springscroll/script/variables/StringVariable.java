package com.coteware.springscroll.script.variables;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public class StringVariable extends AbstractVariable<String> {

    public StringVariable(String name) {
        super(name, DataTypeEnum.STRING);
    }
}
