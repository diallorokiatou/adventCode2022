package org.adventOfCode.day4.campCleanup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

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



}