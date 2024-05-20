package com.coteware.springscroll3.script.expresions;

public class LiteralExpression<T> implements Expression{
    private T value;
    public LiteralExpression(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
