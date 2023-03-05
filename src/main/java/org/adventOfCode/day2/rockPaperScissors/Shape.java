package org.adventOfCode.day2.rockPaperScissors;

public enum Shape {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private final int value;

    Shape(int value) {
        this.value = value;
    }

    public int getScore() {
        return value;
    }
}
