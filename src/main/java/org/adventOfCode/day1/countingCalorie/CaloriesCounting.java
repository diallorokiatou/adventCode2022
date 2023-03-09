package org.adventOfCode.day1.countingCalorie;

import java.util.List;

public class CaloriesCounting {
    private final List<Elf> elfs ;

    public CaloriesCounting(Elf ...elfs) {
        this.elfs = List.of(elfs);
    }

    public Elf findElfCarryingTheMostCalorie() {
        if(this.elfs.size() == 1)
            return this.elfs.get(0);
        return this.elfs.stream().min(Elf::compareTo).orElseThrow();
    }
}
