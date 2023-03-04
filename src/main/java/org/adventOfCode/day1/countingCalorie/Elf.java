package org.adventOfCode.day1.countingCalorie;

import java.util.Arrays;

public record Elf(String name, int... calories) {
    public int sumOfCalories() {
        return Arrays.stream(calories).sum();
    }
}
