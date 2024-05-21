package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.Literal;

public interface Expression {
    void add(Literal literal);

    default void add(DeclarationSpec declarationSpec) {

    }
}
