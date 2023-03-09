package org.adventOfCode.day3.rucksackReorganization;

import java.util.stream.Stream;

public record Rucksack(String items) {
    private static final int INCREMENTTOUPPERCASE = 17;
    private static final int DECREMENTTOUPPER = 9;
    public char findItem() {
        String part1 = getFistCompartment();
        String part2 = getSecondCompartment();

        return Stream.of(part1.split("")).filter(item -> part2.indexOf(""+item) > -1).map(string -> string.charAt(0)).findFirst()
                .orElseThrow(() -> new RuntimeException("no Item found"));

    }

    private String getSecondCompartment() {
        return items.substring(items.length() / 2 + 1);
    }

    private String getFistCompartment() {
        return items.substring(0, items.length() / 2);
    }

    public int findPriority(char item) {
        return Character.isUpperCase(item) ? Character.getNumericValue(item) + INCREMENTTOUPPERCASE : Character.getNumericValue(item) - DECREMENTTOUPPER;
    }
}
