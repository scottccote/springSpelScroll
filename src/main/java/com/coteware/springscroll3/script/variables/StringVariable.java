package com.coteware.springscroll3.script.variables;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public class StringVariable extends AbstractVariable<String> {

    public StringVariable(String name) {
        super(name, DataTypeEnum.STRING);
    }
}
