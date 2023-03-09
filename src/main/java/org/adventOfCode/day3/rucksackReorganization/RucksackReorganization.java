package org.adventOfCode.day3.rucksackReorganization;

import java.util.List;

public class RucksackReorganization {

    private final List<Rucksack> rucksacks;

    RucksackReorganization(Rucksack ...rucksacks){
        this.rucksacks = List.of(rucksacks);
    }

    public int sumOfPriority() {
        int sum = 0;
        for (Rucksack rucksack : this.rucksacks) {
            char item = rucksack.findItem();
            sum += rucksack.findPriority(item);
        }
        return sum;
    }
}
