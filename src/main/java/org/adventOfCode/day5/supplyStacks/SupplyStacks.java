package org.adventOfCode.day5.supplyStacks;

import java.util.Arrays;
import java.util.List;

public class SupplyStacks {
    public String range(List<Stacks> stacks, Move ...moves) {
        Arrays.stream(moves).forEach(move -> stacks.get(move.start() - 1).moveTopTo(move.number(), stacks.get(move.end() - 1)));

        String message = "";
        for (int i = 0, stacksSize = stacks.size(); i < stacksSize; i++) {
            Stacks stack = stacks.get(i);
            message += stack.getTopSymbol();
        }
        return message;
    }
}
