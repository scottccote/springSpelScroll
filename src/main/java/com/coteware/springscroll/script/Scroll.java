package com.coteware.springscroll.script;

import com.coteware.springscroll.script.statements.Block;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Scroll {
    private List<UnitStatement> units = new ArrayList<>();

    public Scroll() {

    }

    public void add(UnitStatement unit) {
        units.add(unit);
    }

    public List<UnitStatement> getUnits() {
        return Collections.unmodifiableList(units);
    }

}
