package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.literals.Literal;

public class LiteralExpression implements Expression{
    private Literal value;

    @Override
    public void add(Literal literal) {
        value = literal;
    }



}
