package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

public class LiteralExpression implements Expression{
    private Literal value;

    @Override
    public void add(Literal literal) {
        value = literal;
    }



}
