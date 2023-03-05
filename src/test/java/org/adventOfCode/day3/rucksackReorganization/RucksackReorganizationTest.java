package org.adventOfCode.day3.rucksackReorganization;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class RucksackReorganizationTest {

    @Test
    void vJrwpWtwJgWrhcsFMMfFFhFp_should_return_p_with_16_priority(){
        String rucksack = "vJrwpWtwJgWrhcsFMMfFFhFp";
        RucksackReorganization rucksackReorganization = new RucksackReorganization();

        Item item = rucksackReorganization.findPriority(rucksack);

        assertEquals("p" , item.name());
        assertEquals(16, item.getPriority());
    }

}