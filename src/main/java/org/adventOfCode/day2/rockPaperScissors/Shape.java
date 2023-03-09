package org.adventOfCode.day2.rockPaperScissors;

public enum Shape {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    final int WINBONUS = 6;
    final int LOSSBONUS = 0;
     final int DRAWBONUS = 3;
    private final int score;

    Shape(int score) {
        this.score = score;
    }

    public int computeScore(Shape shape2) {
        if (score < shape2.score) return WINBONUS + shape2.score;
        if (score > shape2.score) return LOSSBONUS + shape2.score;
        return DRAWBONUS + shape2.score;
    }
}
