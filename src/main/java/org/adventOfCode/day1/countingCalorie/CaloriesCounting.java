package org.adventOfCode.day1.countingCalorie;

import java.util.List;

public class CaloriesCounting {
    private final List<Elf> elfs ;

    public CaloriesCounting(Elf ...elfs) {
        this.elfs = List.of(elfs);
    }

    public Elf findElfCarryingTheMostCalorie() {
        return this.elfs.stream().min(Elf::compareTo).orElseThrow();
    }
}
