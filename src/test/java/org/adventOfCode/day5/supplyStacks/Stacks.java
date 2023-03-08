package org.adventOfCode.day5.supplyStacks;

import java.util.ArrayList;
import java.util.List;

public class Stacks {
    private final int number;
    private List<Create> creates;
    private Create create;

    public Stacks(int number, Create create) {
        this.number = number;
        this.create = create;
        this.creates = new ArrayList<>(List.of(create));
    }

    public Stacks(int number) {
        this.number = number;
        this.creates = new ArrayList<>();
    }

    public Stacks(int number, Create ...creates) {
        this.number = number;
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
