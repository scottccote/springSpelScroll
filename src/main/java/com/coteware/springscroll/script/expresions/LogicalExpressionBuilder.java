package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.Literal;
import org.springframework.expression.spel.ast.BooleanLiteral;

public class LogicalExpressionBuilder implements
        ExpressionBuilder,UnaryLogicalOperation,LogicalOperation {
    private boolean unaryOperation = false;
    private boolean isNull = false;
    private boolean isNot = false;
    private LogicalExpression expression = new LogicalExpression();

    public LogicalExpressionBuilder unaryOperation() {
        this.unaryOperation = true;
        return this;
    }

    @Override
    public Expression build() {
        if (this.isNull) {
            expression.setNull();
        }

        if (this.isNot) {
            expression.setNot();
        }

        return expression;
    }



    @Override
    public void reset() {
        this.expression = new LogicalExpression();
    }

    @Override
    public LogicalOperation addNull() {
        isNull = true;
        return this;
    }

    @Override
    public LogicalOperation addDeclarationSpect(DeclarationSpec declarationSpec) {
        this.expression.add(declarationSpec);
        return this;
    }

    @Override
    public UnaryLogicalOperation setIsNot(boolean isNot) {
        this.isNot = true;
        return this;
    }

    @Override
    public LogicalOperation logicalOperation() {
        return this;
    }
}
