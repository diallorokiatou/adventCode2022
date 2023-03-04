package org.adventOfCode.day1.countingCalorie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class CaloriesCountingTest
{
    private Elf findElfCarryingTheMostCalorie(Elf ...elfs) {
        if(elfs.length == 2)
            return elfs[1];
        else return elfs[0];

    }
    @Test
    void oneElfCarryingAnCalorie(){
        Elf elf = new Elf("elf1", 4000);

        Elf elfFound = findElfCarryingTheMostCalorie(elf);

        assertEquals(4000,elfFound.sumOfCalories());
        assertEquals("elf1", elfFound.name());
    }

    @Test
    void oneElfCarryingListOfTwoCalories(){
        Elf elf = new Elf("elf1", 400, 600);

        Elf elfFound = findElfCarryingTheMostCalorie(elf);

        assertEquals(1000,elfFound.sumOfCalories());
        assertEquals("elf1", elfFound.name());
    }

    @Test
    void twoElfCarryingEachAnCalorie(){
        Elf elf1 = new Elf("elf1", 400);
        Elf elf2 = new Elf("elf2", 600);

        Elf elfFound = findElfCarryingTheMostCalorie(elf1, elf2);

        assertEquals(600,elfFound.sumOfCalories());
        assertEquals("elf2", elfFound.name());
    }


}
