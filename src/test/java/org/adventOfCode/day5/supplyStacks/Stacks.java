package org.adventOfCode.day5.supplyStacks;

import java.util.ArrayList;
import java.util.List;

public class Stacks {
    private List<Create> creates;

    public Stacks(Create create) {
        this.creates = new ArrayList<>(List.of(create));
    }

    public Stacks() {
        this.creates = new ArrayList<>();
    }

    public Stacks(Create ...creates) {
        this.creates = new ArrayList<>(List.of(creates));
    }

    public Create getTop() {
        if(this.creates.isEmpty()) return null;
        return this.creates.get(this.creates.size() - 1);
    }

    void moveTop(Stacks stack2) {
        stack2.creates.add(this.creates.get(this.creates.size() - 1));
        this.creates.remove(this.creates.size() - 1);
    }

}
