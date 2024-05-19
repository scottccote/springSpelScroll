package com.coteware.springscroll3.script;

import com.coteware.springscroll3.script.variables.Variable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ScopeMemory {
    final Map<String, Variable> memory = new HashMap<>();

    public ScopeMemory() {
    }

    public ScopeMemory(final ScopeMemory parentScopeScopeMemory) {
        memory.putAll(parentScopeScopeMemory.memory);
    }

    public void add(Variable variable) {
        memory.put(variable.getName(),variable);
    }

    public Optional<Variable> get(String name) {
        return Optional.ofNullable(memory.get(name));
    }

    public void clear() {
        memory.clear();
    }
}
