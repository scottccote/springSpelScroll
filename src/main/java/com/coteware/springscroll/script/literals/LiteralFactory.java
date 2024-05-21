package com.coteware.springscroll.script.literals;

import com.coteware.antlr.SpelScriptParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class LiteralFactory {
    public LiteralFactory() {  }

    public Literal createLiteral(ParseTree parseTree) {
        Literal literal;
        if ( parseTree instanceof SpelScriptParser.NumericContext) {
            literal = createNumericLiteral(parseTree);
        } else if (parseTree instanceof SpelScriptParser.Numeric_negativeContext) {
            literal = createNegativeNumericLiteral(parseTree);
        }else {
            literal = new CharLiteral(parseTree.getText());
        }
        return literal;
    }

    private Literal createNegativeNumericLiteral(ParseTree parseTree) {
        NumericLiteral numericLiteral = createNumericLiteral(parseTree);
        numericLiteral.negate();
        return numericLiteral;
    }

    private NumericLiteral createNumericLiteral(ParseTree parseTree) {
        NumericLiteral literal = null;
        String text = parseTree.getText();
        //TODO hack hack hack - not proud - "that'l do pig"
        try {
            Integer integer = Integer.valueOf(text);
            literal = new IntegerLiteral(integer);
        } catch (NumberFormatException e) {
            try {
                Float floatValue = Float.valueOf(text);
                literal = new FloatLiteral(floatValue);
            } catch (NumberFormatException e2) {
                throw new UnsupportedOperationException("Cannot parse '" + text + "' as a numeric literal");
            }
        }
        return literal;
    }
}
