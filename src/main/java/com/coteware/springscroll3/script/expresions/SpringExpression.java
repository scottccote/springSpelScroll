package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

import java.util.ArrayList;
import java.util.List;

public class SpringExpression extends AbstractExpression implements Expression {
    private Literal literal;
    private List<DeclarationSpec> declarationSpecs = new ArrayList<>();

    @Override
    public void add(Literal literal) {
        this.literal = literal;
    }

    @Override
    public void add(DeclarationSpec declarationSpec) {
        declarationSpecs.add(declarationSpec);
    }
}
