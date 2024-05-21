package com.coteware.springscroll3.script.declarations;

import com.coteware.springscroll3.script.variables.StringVariable;

public class StringDeclarationSpec extends AbstractDeclarationSpec {

    public StringDeclarationSpec(String name) {
        super(name, DataTypeEnum.STRING);
        setVariable(new StringVariable(name));
    }
}
