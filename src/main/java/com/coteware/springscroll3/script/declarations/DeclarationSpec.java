package com.coteware.springscroll3.script.declarations;

import com.coteware.springscroll3.script.variables.Variable;

public interface DeclarationSpec {
    String getName();
    Variable getVariable();
    void setVariable(Variable variable);
}
