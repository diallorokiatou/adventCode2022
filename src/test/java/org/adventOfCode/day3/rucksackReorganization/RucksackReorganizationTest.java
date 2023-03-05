package org.adventOfCode.day3.rucksackReorganization;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RucksackReorganizationTest {

    @Test
    void no_item(){
        String rucksack = "vJrwwWtwJgWrhcsFMMfFFhFp";

        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        assertThrows(RuntimeException.class,
                ()-> rucksackReorganization.findItem(rucksack));
    }

    @Test
    void lower_case_item(){
        String rucksack = "vJrwpWtwJgWrhcsFMMfFFhFp";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        char item = rucksackReorganization.findItem(rucksack);
        int priority = rucksackReorganization.findPriority(item);

        assertEquals('p' , item);
        assertEquals(16, priority);
    }

    @Test
    void lower_case_item1(){
        String rucksack = "CrZsJsPPZsGzwwsLwLmpwMDw";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        char item = rucksackReorganization.findItem(rucksack);

        assertEquals('s' , item);
    }

    @Test
    void upper_case_item(){
        String rucksack = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        char item = rucksackReorganization.findItem(rucksack);

        assertEquals('L' , item);
    }

    @Test
    void upper_case_item1(){
        String rucksack = "PmmdzqPrVvPwwTWBwg";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        char item = rucksackReorganization.findItem(rucksack);

        assertEquals('P' , item);
    }
}