package com.coteware.springscroll.script;

import com.coteware.springscroll.script.declarations.DeclarationSpec;

import java.util.*;

public class ScopeMemory {
    final Map<String, DeclarationSpec> memory = new HashMap<>();

    public ScopeMemory() {
    }

    public ScopeMemory(final ScopeMemory parentScopeScopeMemory) {
        memory.putAll(parentScopeScopeMemory.memory);
    }

    public List<String> getDeclarationNames() {
        return new ArrayList<>(memory.keySet());
    }

    public void add(DeclarationSpec declarationSpec) {
        memory.put(declarationSpec.getName(),declarationSpec);
    }

    public Optional<DeclarationSpec> get(String name) {
        return Optional.ofNullable(memory.get(name));
    }

    public void clear() {
        memory.clear();
    }
}
