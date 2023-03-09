package org.adventOfCode.day3.rucksackReorganization;

public record Rucksack(String items) {
    private static final int INCREMENTTOUPPERCASE = 17;
    private static final int DECREMENTTOUPPER = 9;
    public char findItem() {
        String part1 = getFistCompartment();
        String part2 = getSecondCompartment();
        for (int i = 0; i < part1.length(); i++) {
           if(part2.indexOf(part1.charAt(i)) > -1)
               return part1.charAt(i);
        }
        throw new RuntimeException("no Item found");
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
