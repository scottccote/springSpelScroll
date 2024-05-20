package com.coteware.springscroll3.script.literals;

import com.coteware.springscroll3.script.declarations.DataTypeEnum;

public class CharLiteral extends AbstractLiteral<String> {
    public CharLiteral(String value) {
        super(value, DataTypeEnum.STRING);
    }
}
