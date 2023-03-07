package org.adventOfCode.day4.campCleanup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class CampCleanupTest {
    @Test
    void sections_d_ont_fully_contain_other(){
        Section section1 = new Section(2,4);
        Section section2 = new Section(6,8);
        CampCleanup campCleanup = new CampCleanup();

        boolean isPairsContainsEachOther = campCleanup.isSectionsContainsEachOther(section1, section2);

        assertFalse(isPairsContainsEachOther);
    }



}