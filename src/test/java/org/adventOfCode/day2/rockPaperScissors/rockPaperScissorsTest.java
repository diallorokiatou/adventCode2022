package org.adventOfCode.day2.rockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class rockPaperScissorsTest {

    public static final int DRAW = 3;
    public static final int LOSS = 0;
    public static final int WIN = 6;

    @Test
    void players_play_same_shape(){
        int computeScore = computeAndRoundScore(Shape.SCISSORS, Shape.SCISSORS);
        assertEquals(6, computeScore);
    }

    @Test
    void players_play_same_shape2(){
        int computeScore = computeAndRoundScore(Shape.ROCK, Shape.ROCK);
        assertEquals(4, computeScore);
    }

    @Test
    void player2_lost(){
        int computeScore = computeAndRoundScore(Shape.PAPER, Shape.ROCK);
        assertEquals(1, computeScore);
    }

    @Test
    void player2_lost1(){
        int computeScore = computeAndRoundScore(Shape.SCISSORS, Shape.PAPER);
        assertEquals(2, computeScore);
    }

    @Test
    void player2_win(){
        int computeScore = computeAndRoundScore(Shape.ROCK, Shape.PAPER);
        assertEquals(8, computeScore);
    }

    @Test
    void player2_win1() {
        int computeScore = computeAndRoundScore(Shape.PAPER, Shape.SCISSORS);
        assertEquals(9, computeScore);
    }

    private int computeAndRoundScore(Shape shape1, Shape shape2) {
        if(shape1.getScore() < shape2.getScore())
            return WIN + shape2.getScore();
        if(shape1.getScore() > shape2.getScore())
            return LOSS + shape2.getScore();
        return DRAW + shape2.getScore();
    }

}