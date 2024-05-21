package com.coteware.springscroll3.script.expresions;

public interface UnaryLogicalOperation extends ExpressionBuilder {
    UnaryLogicalOperation setIsNot(boolean isNot);
    LogicalOperation logicalOperation();
}
