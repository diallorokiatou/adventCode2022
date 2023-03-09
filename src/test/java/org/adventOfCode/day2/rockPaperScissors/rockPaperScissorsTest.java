package org.adventOfCode.day2.rockPaperScissors;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class rockPaperScissorsTest {
    @Test
    void players_play_same_shape(){
        Shape playersShape = Shape.SCISSORS;
        int computeScore = playersShape.computeScore(playersShape);

        assertEquals(6, computeScore);
    }

    @Test
    void players_play_same_shape2(){
        Shape playersShape = Shape.ROCK;
        int computeScore = playersShape.computeScore(playersShape);

        assertEquals(4, computeScore);
    }

    @Test
    void player2_lost(){
        Shape player1Shape = Shape.PAPER;
        Shape player2Shape = Shape.ROCK;

        int computeScore = player1Shape.computeScore(player2Shape);

        assertEquals(1, computeScore);
    }

    @Test
    void player2_lost1(){
        Shape player1Shape = Shape.SCISSORS;
        Shape player2Shape = Shape.PAPER;

        int computeScore = player1Shape.computeScore(player2Shape);

        assertEquals(2, computeScore);
    }

    @Test
    void player2_win(){
        Shape player1Shape = Shape.ROCK;
        Shape player2Shape = Shape.PAPER;

        int computeScore = player1Shape.computeScore(player2Shape);

        assertEquals(8, computeScore);
    }

    @Test
    void player2_win1() {
        Shape player1Shape = Shape.PAPER;
        Shape player2Shape = Shape.SCISSORS;

        int computeScore = player1Shape.computeScore(player2Shape);

        assertEquals(9, computeScore);
    }

    @Test
    void player2_strategic_guide() {
        List<Shape> player1Shapes = Arrays.asList(Shape.ROCK, Shape.PAPER, Shape.SCISSORS);
        List<Shape> player2Shapes = Arrays.asList(Shape.PAPER, Shape.ROCK, Shape.SCISSORS);
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame(player1Shapes, player2Shapes);

        int computeScore = rockPaperScissorsGame.computeStrategicGuideScore();

        assertEquals(15, computeScore);
    }

    @Test
    void player2_strategic_guide_should_throws_errors_when_list_size_are_different() {
        List<Shape> player1Shapes = Arrays.asList(Shape.ROCK, Shape.PAPER);
        List<Shape> player2Shapes = Arrays.asList(Shape.PAPER, Shape.ROCK, Shape.SCISSORS);
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame(player1Shapes, player2Shapes);

        assertThrows(RuntimeException.class,
                rockPaperScissorsGame::computeStrategicGuideScore);
    }
}