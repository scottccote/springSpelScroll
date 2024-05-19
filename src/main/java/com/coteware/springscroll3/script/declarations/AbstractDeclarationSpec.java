package com.coteware.springscroll3.script.declarations;

import com.coteware.springscroll3.script.variables.Variable;

public class AbstractDeclarationSpec implements DeclarationSpec {
    protected final String name;
    protected Variable variable;
    protected final DataTypeEnum dataTypeEnum;

    public AbstractDeclarationSpec(String name, DataTypeEnum dataTypeEnum) {
        this.name = name;
        this.dataTypeEnum = dataTypeEnum;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setVariable(Variable variable) {
        if (!name.contentEquals(variable.getName())) {
            throw new IllegalArgumentException("Variable name mismatch");
        }

        if (this.dataTypeEnum != variable.getDataTypeEnum()) {
            throw new IllegalArgumentException("Variable data type mismatch");
        }

        this.variable = variable;
    }

    @Override
    public Variable getVariable() {
        return variable;
    }
}
