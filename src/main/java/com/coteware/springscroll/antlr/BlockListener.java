package com.coteware.springscroll.antlr;


import com.coteware.antlr.SpelScriptBaseListener;
import com.coteware.antlr.SpelScriptParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlockListener extends SpelScriptBaseListener {
    private List<String> msgs = new ArrayList<>();
    @Override
    public void enterBlock(SpelScriptParser.BlockContext ctx) {
        TerminalNode declareNode = ctx.DECLARE();

        TerminalNode beginNode = ctx.BEGIN();

        if (null != declareNode) {
            String declareNodeText = declareNode.getText();
            msgs.add(declareNodeText);
        }

        if (null != beginNode) {
            String beginNodeText = beginNode.getText();
            msgs.add(beginNodeText);
        }

        super.enterBlock(ctx);
    }

    public List<String> getMsgs() {
        return Collections.unmodifiableList(msgs);
    }
}
