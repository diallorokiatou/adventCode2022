package org.adventOfCode.day2.rockPaperScissors;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void player2_strategic_guide() {
        List<Shape> player1Shapes = Arrays.asList(Shape.ROCK, Shape.PAPER, Shape.SCISSORS);
        List<Shape> player2Shapes = Arrays.asList(Shape.PAPER, Shape.ROCK, Shape.SCISSORS);

        int computeScore = computeStrategicGuideScore(player1Shapes, player2Shapes);

        assertEquals(15, computeScore);
    }

    @Test
    void player2_strategic_guide_should_throws_errors_when_list_size_are_different() {
        List<Shape> player1Shapes = Arrays.asList(Shape.ROCK, Shape.PAPER);
        List<Shape> player2Shapes = Arrays.asList(Shape.PAPER, Shape.ROCK, Shape.SCISSORS);

        assertThrows(RuntimeException.class,
                ()->{
                    computeStrategicGuideScore(player1Shapes, player2Shapes);
                });
    }

    private int computeStrategicGuideScore(List<Shape> player1Shapes, List<Shape> player2Shapes) {
        if(player1Shapes.size() != player2Shapes.size())
            throw  new RuntimeException("Lists must have same size");
        int sum = 0;
        for (int i = 0; i < player1Shapes.size(); i++) {
            sum += computeAndRoundScore(player1Shapes.get(i), player2Shapes.get(i));
        }
        return sum;
    }

    private int computeAndRoundScore(Shape shape1, Shape shape2) {
        if(shape1.getScore() < shape2.getScore())
            return WIN + shape2.getScore();
        if(shape1.getScore() > shape2.getScore())
            return LOSS + shape2.getScore();
        return DRAW + shape2.getScore();
    }

}