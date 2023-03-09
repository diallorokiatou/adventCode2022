package org.adventOfCode.day3.rucksackReorganization;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RucksackReorganizationTest {

    @Test
    void no_item(){
        Rucksack rucksack = new Rucksack("vJrwwWtwJgWrhcsFMMfFFhFp");


        assertThrows(RuntimeException.class, rucksack::findItem);
    }

    @Test
    void lower_case_item(){
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

        char item = rucksack.findItem();
        int priority = rucksack.findPriority(item);

        assertEquals('p' , item);
        assertEquals(16, priority);
    }

    @Test
    void lower_case_item1(){
        Rucksack rucksack = new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw");

        char item = rucksack.findItem();
        int priority = rucksack.findPriority(item);

        assertEquals('s' , item);
        assertEquals(19, priority);
    }

    @Test
    void upper_case_item(){
        Rucksack rucksack = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");

        char item = rucksack.findItem();
        int priority = rucksack.findPriority(item);

        assertEquals('L' , item);
        assertEquals(38, priority);
    }

    @Test
    void upper_case_item1(){
        Rucksack rucksack = new Rucksack("PmmdzqPrVvPwwTWBwg");

        char item = rucksack.findItem();
        int priority = rucksack.findPriority(item);

        assertEquals('P' , item);
        assertEquals(42, priority);
    }

    @Test
    void sum_of_priority_of_list_of_one_rucksack(){
        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        List<Rucksack> rucksackList = List.of(new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp"));

        int sumOfPriority = rucksackReorganization.sumOfPriority(rucksackList);

        assertEquals(16, sumOfPriority);
    }

    @Test
    void sum_of_priority_of_list_of_two_rucksack(){
        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        List<Rucksack> rucksackList = Arrays.asList(new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp"),
                                                    new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"));

        int sumOfPriority = rucksackReorganization.sumOfPriority(rucksackList);

        assertEquals(54, sumOfPriority);
    }

    @Test
    void sum_of_priority_of_list_of_rucksack(){
        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        List<Rucksack> rucksackList = Arrays.asList(new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp"),
                                                    new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"),
                                                    new Rucksack("PmmdzqPrVvPwwTWBwg"),
                                                    new Rucksack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"),
                                                    new Rucksack("ttgJtRGJQctTZtZT"),
                                                    new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw"));

        int sumOfPriority = rucksackReorganization.sumOfPriority(rucksackList);

        assertEquals(157, sumOfPriority);
    }
}