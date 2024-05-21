package com.coteware.springscroll3.script.declarations;

import com.coteware.springscroll3.script.variables.FloatVariable;

public class FloatDeclarationSpec extends AbstractDeclarationSpec {
    public FloatDeclarationSpec(String name) {
        super(name, DataTypeEnum.FLOAT);
        setVariable(new FloatVariable(name));
    }
}
