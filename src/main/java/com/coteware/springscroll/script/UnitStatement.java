package com.coteware.springscroll.script;

import com.coteware.springscroll.script.statements.Block;

public class UnitStatement {
    private final Block block;
    private final String name;

    public UnitStatement(Block block, String name) {
        this.block = block;
        this.name = name;
    }

    public Block getBlock() {
        return block;
    }

    public String getName() {
        return name;
    }
}
