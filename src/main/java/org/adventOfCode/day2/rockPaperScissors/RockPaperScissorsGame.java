package org.adventOfCode.day2.rockPaperScissors;

import java.util.List;
import java.util.stream.IntStream;

public class RockPaperScissorsGame {

    private final List<Shape> player1Shapes;
    private final List<Shape> player2Shapes;

    public RockPaperScissorsGame(List<Shape> player1Shapes, List<Shape> player2Shapes) {
        this.player1Shapes = player1Shapes;
        this.player2Shapes = player2Shapes;
    }

    public int computeStrategicGuideScore() {
        if(this.player1Shapes.size() != this.player2Shapes.size())
            throw  new RuntimeException("Lists must have same size");
        return IntStream.range(0, this.player1Shapes.size()).map(i -> this.player1Shapes.get(i).computeScore(this.player2Shapes.get(i))).sum();
    }

}
