package com.coteware.springscroll.antlr;

import com.coteware.antlr.SpelScriptLexer;
import com.coteware.antlr.SpelScriptParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BlockListenerTest {
    @Test
    public void whenOneMethodStartsWithUpperCase_thenOneErrorReturned() throws Exception{

        String spelScriptContent = "DECLARE foo STRING; BEGIN foo := 'BAR'; END;";
        SpelScriptLexer spelScriptLexer = new SpelScriptLexer(CharStreams.fromString(spelScriptContent));
        CommonTokenStream tokens = new CommonTokenStream(spelScriptLexer);
        SpelScriptParser spelScriptParser = new SpelScriptParser(tokens);
        ParseTree tree = spelScriptParser.scroll();
        ParseTreeWalker walker = new ParseTreeWalker();
        BlockListener blockListener = new BlockListener();
        walker.walk(blockListener, tree);

        assertThat(blockListener.getMsgs().size(), is(2));
        assertThat(blockListener.getMsgs().get(0),
                is("DECLARE"));
        assertThat(blockListener.getMsgs().get(1),
                is("BEGIN"));
    }
}