package org.adventOfCode.day2.rockPaperScissors;

import java.util.List;

public class RockPaperScissorsGame {
    private final int DRAW = 3;
    private final int LOSS = 0;
    private final int WIN = 6;

    public int computeStrategicGuideScore(List<Shape> player1Shapes, List<Shape> player2Shapes) {
        if(player1Shapes.size() != player2Shapes.size())
            throw  new RuntimeException("Lists must have same size");
        int sum = 0;
        for (int i = 0; i < player1Shapes.size(); i++) {
            sum += computeAndRoundScore(player1Shapes.get(i), player2Shapes.get(i));
        }
        return sum;
    }

    public int computeAndRoundScore(Shape shape1, Shape shape2) {
        if(shape1.getScore() < shape2.getScore())
            return WIN + shape2.getScore();
        if(shape1.getScore() > shape2.getScore())
            return LOSS + shape2.getScore();
        return DRAW + shape2.getScore();
    }
}
