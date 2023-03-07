package org.adventOfCode.day4.campCleanup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampCleanupTest {
    @Test
    void section1_d_ont_fully_contain_section2(){
        Section section1 = new Section(2,4);
        Section section2 = new Section(6,8);
        CampCleanup campCleanup = new CampCleanup();

        boolean isPairsContainsEachOther = campCleanup.isSectionsContainsEachOther(section1, section2);

        assertFalse(isPairsContainsEachOther);
    }

    @Test
    void section2_d_ont_fully_contain_section1(){
        Section section1 = new Section(4,5);
        Section section2 = new Section(2,3);
        CampCleanup campCleanup = new CampCleanup();

        boolean isPairsContainsEachOther = campCleanup.isSectionsContainsEachOther(section1, section2);

        assertFalse(isPairsContainsEachOther);
    }

    @Test
    void section1_fully_contain_section2(){
        Section section1 = new Section(4,6);
        Section section2 = new Section(6,6);
        CampCleanup campCleanup = new CampCleanup();

        boolean isPairsContainsEachOther = campCleanup.isSectionsContainsEachOther(section1, section2);

        assertTrue(isPairsContainsEachOther);
    }

    @Test
    void section2_fully_contain_section3(){
        Section section1 = new Section(6,6);
        Section section2 = new Section(4,6);
        CampCleanup campCleanup = new CampCleanup();

        boolean isPairsContainsEachOther = campCleanup.isSectionsContainsEachOther(section1, section2);

        assertTrue(isPairsContainsEachOther);
    }

    @Test
    void sum_of_pairs_contains_each_other(){
        Pairs pairs1 = Pairs.createPairs("2-4", "6-8");
        Pairs pairs2 = Pairs.createPairs("2-3", "4-5");
        Pairs pairs3 = Pairs.createPairs("5-7", "7-9");
        Pairs pairs4 = Pairs.createPairs("2-8", "3-7");
        Pairs pairs5 = Pairs.createPairs("6-6", "4-6");
        Pairs pairs6 = Pairs.createPairs("2-6", "4-8");
        CampCleanup campCleanup = new CampCleanup();

        int sumOfPairsFullyContainsEachOther = campCleanup.sumOfPairsFullyContainsEachOther(pairs1, pairs2, pairs3, pairs4, pairs5, pairs6);

        assertEquals(2, sumOfPairsFullyContainsEachOther);
    }

}