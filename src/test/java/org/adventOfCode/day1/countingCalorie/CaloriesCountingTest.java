package org.adventOfCode.day1.countingCalorie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class CaloriesCountingTest
{
    private Elf findElfCarryingTheMostCalorie(Elf elf) {
        return elf;
    }
    @Test
    void oneElfCarryingAnCalorie(){
        Elf elf = new Elf("elf1", 4000);

        Elf elfFound = findElfCarryingTheMostCalorie(elf);

        assertEquals(4000,elfFound.calorie());
        assertEquals("elf1", elfFound.name());
    }

}
