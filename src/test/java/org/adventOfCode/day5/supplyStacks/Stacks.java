package org.adventOfCode.day5.supplyStacks;

public class Stacks {
    private final int number;
    private Create create;

    public Stacks(int number, Create create) {
        this.number = number;
        this.create = create;
    }

    public Stacks(int number) {
        this.number = number;
    }

    public Create getTop() {
        return this.create;
    }

    void moveTop(Stacks stack2) {
        stack2.create = create;
        this.create = null;
    }
}
