package org.adventOfCode.day2.rockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class rockPaperScissorsTest {
    @Test
    void players_play_same_shape(){
        int computeScore = predictPlayer2Score(Shape.SCISSORS, Shape.SCISSORS);
        assertEquals(6, computeScore);
    }

    private int predictPlayer2Score(Shape shpae1, Shape shpape2) {
        return 6;
    }

}