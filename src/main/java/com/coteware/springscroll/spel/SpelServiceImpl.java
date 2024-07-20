package com.coteware.springscroll.spel;

import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.BeanResolver;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Optional;

public class SpelServiceImpl implements SpelService {
    public SpelServiceImpl () {

    }

    public Optional<?> evaluate(
            String expression
            ,SpelParserConfiguration spelParserConfiguration
            ,StandardEvaluationContext standardEvaluationContext
    ) {
        ExpressionParser parser = new SpelExpressionParser(spelParserConfiguration);
        Expression exp;
            exp = parser.parseExpression(expression);
        Object value = exp.getValue(standardEvaluationContext);
        return Optional.ofNullable(value);
    }

    public static SpelParserConfiguration getSpelParserConfiguration() {
        return new SpelParserConfiguration();
    }

    public static StandardEvaluationContext getStandardEvaluationContext(SpelRoot spelRoot,BeanResolver beanResolver) {

        StandardEvaluationContext evaluationContext;
        if (null == spelRoot) {
            evaluationContext = new StandardEvaluationContext();
        } else {
            evaluationContext = new StandardEvaluationContext(spelRoot);
        }
        evaluationContext.setBeanResolver(beanResolver);
        return evaluationContext;
    }


}