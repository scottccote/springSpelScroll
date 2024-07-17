package com.coteware.springscroll.spel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.BeanResolver;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Import(SpelTestConfiguration.class)
class SpelServiceImplTest {

    @Autowired
    private SpelServiceBeanResolver beanResolver;

    @Test
    void evaluate() {
        SpelServiceImpl spelService = new SpelServiceImpl();
        SpelParserConfiguration configuration = SpelServiceImpl.getSpelParserConfiguration();

        StandardEvaluationContext context = SpelServiceImpl.getStandardEvaluationContext(null,beanResolver);
        Optional<?> maybe = spelService.evaluate("new String('hello world').toUpperCase()", configuration,context);
        assertTrue(maybe.isPresent());
        assertEquals("HELLO WORLD", maybe.get());
    }

    @Test
    void evaluate2() {
        SpelServiceImpl spelService = new SpelServiceImpl();
        SpelParserConfiguration configuration = SpelServiceImpl.getSpelParserConfiguration();

        StandardEvaluationContext context = SpelServiceImpl.getStandardEvaluationContext(null,beanResolver);
        Optional<?> maybe = spelService.evaluate("@spelDemoService.vavoom('booyah')", configuration,context);
        assertTrue(maybe.isPresent());
        assertEquals("vavoom----->booyah", maybe.get());
    }


    @Test
    void evaluate3() {
        SpelServiceImpl spelService = new SpelServiceImpl();
        SpelParserConfiguration configuration = SpelServiceImpl.getSpelParserConfiguration();
        SpelRoot spelRoot = new SpelRoot();
        spelRoot.setParameter("howdy partner");
        StandardEvaluationContext context = SpelServiceImpl.getStandardEvaluationContext(spelRoot,beanResolver);
        Optional<?> maybe = spelService.evaluate("@spelDemoService.vavoom(#root.getParameter())", configuration,context);
        assertTrue(maybe.isPresent());
        assertEquals("vavoom----->howdy partner", maybe.get());
    }
}