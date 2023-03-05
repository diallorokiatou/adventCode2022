package org.adventOfCode.day2.rockPaperScissors;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class rockPaperScissorsTest {
    @Test
    void players_play_same_shape(){
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        int computeScore = rockPaperScissorsGame.computeAndRoundScore(Shape.SCISSORS, Shape.SCISSORS);

        assertEquals(6, computeScore);
    }

    @Test
    void players_play_same_shape2(){
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        int computeScore = rockPaperScissorsGame.computeAndRoundScore(Shape.ROCK, Shape.ROCK);

        assertEquals(4, computeScore);
    }

    @Test
    void player2_lost(){
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        int computeScore = rockPaperScissorsGame.computeAndRoundScore(Shape.PAPER, Shape.ROCK);

        assertEquals(1, computeScore);
    }

    @Test
    void player2_lost1(){
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        int computeScore = rockPaperScissorsGame.computeAndRoundScore(Shape.SCISSORS, Shape.PAPER);

        assertEquals(2, computeScore);
    }

    @Test
    void player2_win(){
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        int computeScore = rockPaperScissorsGame.computeAndRoundScore(Shape.ROCK, Shape.PAPER);

        assertEquals(8, computeScore);
    }

    @Test
    void player2_win1() {
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        int computeScore = rockPaperScissorsGame.computeAndRoundScore(Shape.PAPER, Shape.SCISSORS);

        assertEquals(9, computeScore);
    }

    @Test
    void player2_strategic_guide() {
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        List<Shape> player1Shapes = Arrays.asList(Shape.ROCK, Shape.PAPER, Shape.SCISSORS);
        List<Shape> player2Shapes = Arrays.asList(Shape.PAPER, Shape.ROCK, Shape.SCISSORS);

        int computeScore = rockPaperScissorsGame.computeStrategicGuideScore(player1Shapes, player2Shapes);

        assertEquals(15, computeScore);
    }

    @Test
    void player2_strategic_guide_should_throws_errors_when_list_size_are_different() {
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();

        List<Shape> player1Shapes = Arrays.asList(Shape.ROCK, Shape.PAPER);
        List<Shape> player2Shapes = Arrays.asList(Shape.PAPER, Shape.ROCK, Shape.SCISSORS);

        assertThrows(RuntimeException.class,
                ()-> rockPaperScissorsGame.computeStrategicGuideScore(player1Shapes, player2Shapes));
    }
}