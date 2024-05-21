package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;
import com.coteware.springscroll.script.literals.Literal;

public interface ExpressionBuilder {
    Expression build();
    void reset();
    default <T extends ExpressionBuilder> T addLiteral(Literal literal) {
        return (T) this;
    }

    default <T extends ExpressionBuilder> T addDeclarationSpect(DeclarationSpec declarationSpec) {
        return (T) this;
    }

}
