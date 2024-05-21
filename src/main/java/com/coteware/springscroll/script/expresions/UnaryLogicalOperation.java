package com.coteware.springscroll.script.expresions;

public interface UnaryLogicalOperation extends ExpressionBuilder {
    UnaryLogicalOperation setIsNot(boolean isNot);
    LogicalOperation logicalOperation();
}
