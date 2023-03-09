package org.adventOfCode.day3.rucksackReorganization;

import org.junit.jupiter.api.Test;

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
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        RucksackReorganization rucksackReorganization = new RucksackReorganization(rucksack);

        int sumOfPriority = rucksackReorganization.sumOfPriority();

        assertEquals(16, sumOfPriority);
    }

    @Test
    void sum_of_priority_of_list_of_two_rucksack(){
        Rucksack rucksack1 = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        Rucksack rucksack2 = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        RucksackReorganization rucksackReorganization = new RucksackReorganization(rucksack1, rucksack2);

        int sumOfPriority = rucksackReorganization.sumOfPriority();

        assertEquals(54, sumOfPriority);
    }

    @Test
    void sum_of_priority_of_list_of_rucksack(){
        Rucksack rucksack1 = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        Rucksack rucksack2 = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        Rucksack rucksack3 = new Rucksack("PmmdzqPrVvPwwTWBwg");
        Rucksack rucksack4 = new Rucksack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");
        Rucksack rucksack5 = new Rucksack("ttgJtRGJQctTZtZT");
        Rucksack rucksack6 = new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw");
        RucksackReorganization rucksackReorganization = new RucksackReorganization(rucksack1, rucksack2, rucksack3, rucksack4, rucksack5, rucksack6);

        int sumOfPriority = rucksackReorganization.sumOfPriority();

        assertEquals(157, sumOfPriority);
    }
}