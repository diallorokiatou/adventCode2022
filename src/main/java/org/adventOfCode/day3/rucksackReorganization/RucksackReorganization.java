package org.adventOfCode.day3.rucksackReorganization;

import java.util.List;

public class RucksackReorganization {

    public int sumOfPriority(List<Rucksack> rucksackList) {
        int sum = 0;
        for (Rucksack rucksack: rucksackList) {
            char item = rucksack.findItem();
            sum += rucksack.findPriority(item);
        }
        return sum;
    }
}
