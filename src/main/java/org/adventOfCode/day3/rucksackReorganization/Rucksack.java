package org.adventOfCode.day3.rucksackReorganization;

public record Rucksack(String items) {
    private static final int INCREMENTTOUPPERCASE = 17;
    private static final int DECREMENTTOUPPER = 9;
    public char findItem() {
        String part1 = items.substring(0, items.length() / 2);
        String part2 = items.substring(items.length()/2 + 1);
        for (int i = 0; i < part1.length(); i++) {
            for (int j = 0; j < part2.length(); j++) {
                if(part1.charAt(i) == part2.charAt(j)){
                    return part1.charAt(i);
                }
            }
        }
        throw new RuntimeException("no Item found");
    }

    public int findPriority(char item) {
        if(Character.isUpperCase(item))
            return Character.getNumericValue(item) + INCREMENTTOUPPERCASE;
        return Character.getNumericValue(item) - DECREMENTTOUPPER;
    }
}
