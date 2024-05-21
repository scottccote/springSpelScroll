package com.coteware.springscroll.script.declarations;

import com.coteware.springscroll.script.variables.Variable;

public interface DeclarationSpec {
    String getName();
    Variable getVariable();
    void setVariable(Variable variable);
}
