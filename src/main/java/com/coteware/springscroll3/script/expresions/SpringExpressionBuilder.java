package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

public class SpringExpressionBuilder implements ExpressionBuilder {
    private SpringExpression expression = new SpringExpression();

    public SpringExpressionBuilder addLiteral(Literal literal) {
        this.expression.add(literal);
        return this;
    }

    @Override
    public SpringExpressionBuilder addDeclarationSpect(DeclarationSpec declarationSpec) {
        this.expression.add(declarationSpec);
        return this;
    }

    @Override
    public Expression build() {
        return this.expression;
    }

    @Override
    public void reset() {
        this.expression = new SpringExpression();
    }
}
