package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;
import com.coteware.springscroll3.script.literals.Literal;

public interface Expression {
    void add(Literal literal);

    default void add(DeclarationSpec declarationSpec) {

    }
}
