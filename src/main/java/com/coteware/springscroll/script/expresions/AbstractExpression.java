package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.AbstractLiteral;
import com.coteware.springscroll.script.literals.Literal;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractExpression<S,T extends Literal<S>> implements Expression<S,T> {

    protected Map<String,DeclarationSpec<?>> declarationSpecMap = new HashMap<>();

    public <M> void add(DeclarationSpec<M> declarationSpec) {
        declarationSpecMap.put(declarationSpec.getName(),declarationSpec);
    }

    @Override
    public ExpressionResult<S,T> evaluate() {
        return doEvaluate();
    }

    protected abstract ExpressionResult<S,T> doEvaluate();
}
