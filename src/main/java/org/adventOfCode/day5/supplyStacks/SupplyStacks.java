package org.adventOfCode.day5.supplyStacks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SupplyStacks {
    public String range(List<Stacks> stacks, Move ...moves) {
        Arrays.stream(moves).forEach(move -> stacks.get(move.start() - 1).moveTopTo(move.number(), stacks.get(move.end() - 1)));
        return stacks.stream().map(Stacks::getTopSymbol).collect(Collectors.joining());
    }
}
