package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

public class ExpressionBuilder {
    private ExpressionBuilder expressionBuilder;
    private Expression expression;

    public static ExpressionBuilder newInstance() {
        return new ExpressionBuilder();
    }

    public ExpressionBuilder addLogicalExpression(LogicalExpression expression) {
        this.expression = expression;
        return this;
    }

    public ExpressionBuilder addLiteralExpression(LiteralExpression expression) {
        this.expression = expression;
        return this;
    }

    public ExpressionBuilder addSpringExpression(SpringExpression expression) {
        this.expression = expression;
        return this;
    }
    public ExpressionBuilder startLogicalExpression() {
        this.expression = new LogicalExpression();
        return this;
    }
    public ExpressionBuilder startLiteralExpression() {
        this.expression = new LiteralExpression();
        return this;
    }

    public ExpressionBuilder startSpringExpression() {
        this.expression = new SpringExpression();
        return this;
    }

    public Expression build() {
        return this.expression;
    }

    public ExpressionBuilder addLiteral(Literal literal) {
        if (null == this.expression) {
            this.expression = new LiteralExpression();
        }
        this.expression.add(literal);
        return this;
    }

    public ExpressionBuilder addDeclarationSpec(DeclarationSpec declarationSpec) {
        this.expression.add(declarationSpec);
        return this;
    }

    public void reset() {
        this.expression = null;
    }
}
