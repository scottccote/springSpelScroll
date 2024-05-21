package com.coteware.springscroll3.script.expresions;

import com.coteware.springscroll3.script.declarations.DeclarationSpec;

public interface LogicalOperation extends ExpressionBuilder {
    LogicalOperation addNull();
    LogicalOperation addDeclarationSpect(DeclarationSpec declarationSpec);
}
