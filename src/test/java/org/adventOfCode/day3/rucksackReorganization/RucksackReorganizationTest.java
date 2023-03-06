package org.adventOfCode.day3.rucksackReorganization;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
        int priority = rucksackReorganization.findPriority(item);

        assertEquals('s' , item);
        assertEquals(19, priority);
    }

    @Test
    void upper_case_item(){
        String rucksack = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        char item = rucksackReorganization.findItem(rucksack);
        int priority = rucksackReorganization.findPriority(item);

        assertEquals('L' , item);
        assertEquals(38, priority);
    }

    @Test
    void upper_case_item1(){
        String rucksack = "PmmdzqPrVvPwwTWBwg";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        char item = rucksackReorganization.findItem(rucksack);
        int priority = rucksackReorganization.findPriority(item);

        assertEquals('P' , item);
        assertEquals(42, priority);
    }

    @Test
    void sum_of_priority_of_list_of_one_rucksack(){
        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        List<String> rucksackList = List.of("vJrwpWtwJgWrhcsFMMfFFhFp");

        int sumOfPriority = rucksackReorganization.sumOfPriority(rucksackList);

        assertEquals(16, sumOfPriority);
    }

    @Test
    void sum_of_priority_of_list_of_two_rucksack(){
        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        List<String> rucksackList = Arrays.asList("vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");

        int sumOfPriority = rucksackReorganization.sumOfPriority(rucksackList);

        assertEquals(54, sumOfPriority);
    }

    @Test
    void sum_of_priority_of_list_of_rucksack(){
        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        List<String> rucksackList = Arrays.asList("vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL", "PmmdzqPrVvPwwTWBwg",
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", "ttgJtRGJQctTZtZT", "CrZsJsPPZsGzwwsLwLmpwMDw");

        int sumOfPriority = rucksackReorganization.sumOfPriority(rucksackList);

        assertEquals(157, sumOfPriority);
    }
}