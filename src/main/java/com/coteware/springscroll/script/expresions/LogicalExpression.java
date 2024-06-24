package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.Literal;

public class LogicalExpression extends AbstractExpression<Boolean,Literal<Boolean>> {

    private DeclarationSpec<Boolean> declarationSpec;
    private boolean isNull = false;
    private boolean isNot = false;

    @Override
    public void add(Literal literal) {

    }

    @Override
    public ExpressionResult<Boolean, Literal<Boolean>> doEvaluate() {
        return null;
    }

    public void setNull() {
        this.isNull = true;
    }

    public void setNot() {
        this.isNot = true;
    }
}
