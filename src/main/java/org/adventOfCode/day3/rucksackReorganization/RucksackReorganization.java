package org.adventOfCode.day3.rucksackReorganization;

import java.util.List;

public class RucksackReorganization {

    public static final int INCREMENTTOUPPERCASE = 17;
    public static final int DECREMENTTOUPPER = 9;

    public char findItem(String rucksack) {
        String part1 = rucksack.substring(0, rucksack.length() / 2);
        String part2 =rucksack.substring(rucksack.length()/2 + 1);
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

    public int sumOfPriority(List<String> rucksackList) {
        int sum = 0;
        for (String rucksack: rucksackList) {
            char item = findItem(rucksack);
            sum += findPriority(item);
        }
        return sum;
    }
}
