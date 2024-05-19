package com.coteware.springscroll3.script.expresions;

public class ExpressionFactory {
    public Expression createExpression(ExpressionTypeEnum expressionTypeEnum, Object expression) {
        switch (expressionTypeEnum) {
            case LOGICAL_EXPRESSION :
                break;
            case LITERAL:
                break;
            case SPRING_EXPRESSION:
                break;
            default:
                throw new UnsupportedOperationException(String.format("Unsupported expression type: %s", expressionTypeEnum));
        }
        return null;
    }
}
