package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

public class ExpressionBuilderFactory {
    private ExpressionBuilder expressionBuilder;

    public static ExpressionBuilderFactory newInstance() {
        return new ExpressionBuilderFactory();
    }

   public LogicalExpressionBuilder startLogicalExpression() {
       LogicalExpressionBuilder logicalExpressionBuilder = new LogicalExpressionBuilder();
       this.expressionBuilder = logicalExpressionBuilder;
       return logicalExpressionBuilder;
    }
    public LiteralExpressionBuilder startLiteralExpression() {
        LiteralExpressionBuilder literalExpressionBuilder = new LiteralExpressionBuilder();
        this.expressionBuilder = literalExpressionBuilder;
        return literalExpressionBuilder;
    }

    public SpringExpressionBuilder startSpringExpression() {
        SpringExpressionBuilder springExpressionBuilder = new SpringExpressionBuilder();
        this.expressionBuilder = springExpressionBuilder;
        return springExpressionBuilder;
    }
//
    public Expression build() {
        return this.expressionBuilder.build();
    }

    public <T extends ExpressionBuilder>  T addLiteral(Literal literal) {
        return (T) this.expressionBuilder.addLiteral(literal);
    }


    public <T extends ExpressionBuilder>  T addDeclarationSpec(DeclarationSpec declarationSpec) {
        return (T) this.expressionBuilder.addDeclarationSpect(declarationSpec);
    }
//
    public void reset() {
        this.expressionBuilder.reset();
        this.expressionBuilder = null;
    }
}
