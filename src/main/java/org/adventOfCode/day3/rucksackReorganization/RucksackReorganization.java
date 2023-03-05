package org.adventOfCode.day3.rucksackReorganization;

public class RucksackReorganization {
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
}
