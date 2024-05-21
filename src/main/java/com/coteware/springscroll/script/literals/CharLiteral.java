package com.coteware.springscroll.script.literals;

import com.coteware.springscroll.script.declarations.DataTypeEnum;

public class CharLiteral extends AbstractLiteral<String> {
    public CharLiteral(String value) {
        super(value, DataTypeEnum.STRING);
    }
}
