package com.coteware.springscroll.script.statements;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.expresions.Expression;
import com.coteware.springscroll.script.expresions.ExpressionResult;
import com.coteware.springscroll.script.variables.Variable;

public class AssignmentStatement extends AbstractStatement {
    private DeclarationSpec declarationSpec;
    private Expression expression;

    public AssignmentStatement() {
        super(StatementTypeEnum.ASSIGNMENT);
    }

    public void setDeclarationSpec(DeclarationSpec declarationSpec) {
        this.declarationSpec = declarationSpec;
    }

    @Override
    public void add(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void doExecute() {
        ExpressionResult expressionResult = this.expression.evaluate();
        Variable variable = this.declarationSpec.getVariable();
        variable.setValue(expressionResult.getLiteral().getValue());
    }
}
