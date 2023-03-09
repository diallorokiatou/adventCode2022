package org.adventOfCode.day1.countingCalorie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaloriesCountingTest
{
    @Test
    void oneElfCarryingAnCalorie(){
        Elf elf = new Elf("elf1", 4000);
        CaloriesCounting caloriesCounting = new CaloriesCounting(elf);

        Elf elfFound = caloriesCounting.findElfCarryingTheMostCalorie();

        assertEquals(4000,elfFound.sumOfCalories());
        assertEquals("elf1", elfFound.name());
    }

    @Test
    void oneElfCarryingListOfTwoCalories(){
        Elf elf = new Elf("elf1", 400, 600);
        CaloriesCounting caloriesCounting = new CaloriesCounting(elf);

        Elf elfFound = caloriesCounting.findElfCarryingTheMostCalorie();

        assertEquals(1000,elfFound.sumOfCalories());
        assertEquals("elf1", elfFound.name());
    }

    @Test
    void twoElfCarryingEachAnCalorie(){
        Elf elf1 = new Elf("elf1", 400);
        Elf elf2 = new Elf("elf2", 600);
        CaloriesCounting caloriesCounting = new CaloriesCounting(elf1, elf2);

        Elf elfFound = caloriesCounting.findElfCarryingTheMostCalorie();

        assertEquals(600,elfFound.sumOfCalories());
        assertEquals("elf2", elfFound.name());
    }

    @Test
    void twoElfCarryingEachAListOfCalorie(){
        Elf elf1 = new Elf("elf1", 400, 600);
        Elf elf2 = new Elf("elf2", 500, 300);
        CaloriesCounting caloriesCounting = new CaloriesCounting(elf1, elf2);

        Elf elfFound = caloriesCounting.findElfCarryingTheMostCalorie();

        assertEquals(1000,elfFound.sumOfCalories());
        assertEquals("elf1", elfFound.name());
    }

    @Test
    void threeElfCarryingEachAListOfCalorie(){
        Elf elf1 = new Elf("elf1", 200, 200);
        Elf elf2 = new Elf("elf2", 100, 100);
        Elf elf3 = new Elf("elf3", 500, 500);
        CaloriesCounting caloriesCounting = new CaloriesCounting(elf1, elf2, elf3);

        Elf elfFound = caloriesCounting.findElfCarryingTheMostCalorie();

        assertEquals(1000,elfFound.sumOfCalories());
        assertEquals("elf3", elfFound.name());
    }


}
