package com.coteware.springscroll3.script.declarations;

public class DeclarationSpecFactory {
    public DeclarationSpec createDeclarationSpec(String variableName,DataTypeEnum dataTypeEnum) {
        switch (dataTypeEnum) {
            case STRING:
                return new StringDeclarationSpec(variableName);
            case INTEGER:
                return new IntegerDeclarationSpec(variableName);
            default:
                throw new UnsupportedOperationException(String.format("cannot create spec for variable [%s] of type [%s]",variableName, dataTypeEnum));
        }

    }
}
