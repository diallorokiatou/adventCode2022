package org.adventOfCode.day3.rucksackReorganization;

public enum Item {
    p(16);

    private final int priority;

    Item(int priority) {
        this.priority = priority;
    }


    public int getPriority() {
        return priority;
    }
}
