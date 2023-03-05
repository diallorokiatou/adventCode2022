package org.adventOfCode.day2.rockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class rockPaperScissorsTest {

    public static final int SAMESHAPESCORE = 3;

    @Test
    void players_play_same_shape(){
        int computeScore = predictPlayer2Score(Shape.SCISSORS, Shape.SCISSORS);
        assertEquals(6, computeScore);
    }

    @Test
    void players_play_same_shape2(){
        int computeScore = predictPlayer2Score(Shape.ROCK, Shape.ROCK);
        assertEquals(4, computeScore);
    }

    private int predictPlayer2Score(Shape shape1, Shape shape2) {
        return SAMESHAPESCORE + shape1.getScore();
    }

}