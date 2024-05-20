package com.coteware.springscroll3.script.statements;

import com.coteware.springscroll3.script.ScopeMemory;
import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.expresions.Expression;

public class AssignmentStatement extends AbstractStatement {
    private DeclarationSpec declarationSpec;
    private Expression expression;

    public AssignmentStatement() {
    }

    public void setDeclarationSpec(DeclarationSpec declarationSpec) {
        this.declarationSpec = declarationSpec;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void execute() {

    }
}
