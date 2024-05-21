package com.coteware.springscroll.script.expresions;

import com.coteware.springscroll.script.declarations.DeclarationSpec;

public interface LogicalOperation extends ExpressionBuilder {
    LogicalOperation addNull();
    LogicalOperation addDeclarationSpect(DeclarationSpec declarationSpec);
}
