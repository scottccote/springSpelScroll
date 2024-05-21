package com.coteware.springscroll.script;

import com.coteware.springscroll.script.statements.Block;

import java.util.ArrayList;
import java.util.List;

public class Scroll {
    private List<Block> blocks = new ArrayList<>();

    public Scroll() {

    }

    public void addBlock(Block block) {
        this.blocks.add(block);
    }
}
