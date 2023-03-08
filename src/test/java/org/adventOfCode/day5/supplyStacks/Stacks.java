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
        return this.creates.get(getLastIndex());
    }

    void moveTopTo(int numberOfCreate, Stacks stack2) {
        if(getSize() < numberOfCreate) throw new RuntimeException("can't move");
        for (int i = 0; i < numberOfCreate; i++) {
            stack2.creates.add(this.creates.get(getLastIndex()));
            this.creates.remove(getLastIndex());
        }

    }

    private int getLastIndex() {
        return getSize() - 1;
    }

    public int getSize() {
        return this.creates.size();
    }

}
