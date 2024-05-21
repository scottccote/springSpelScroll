package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

public class LogicalExpression extends AbstractExpression implements Expression {

    private DeclarationSpec declarationSpec;
    private boolean isNull = false;
    private boolean isNot = false;

    @Override
    public void add(Literal literal) {

    }

    @Override
    public void add(DeclarationSpec declarationSpec) {
        this.declarationSpec = declarationSpec;
    }

    public void setNull() {
        this.isNull = true;
    }

    public void setNot() {
        this.isNot = true;
    }
}
