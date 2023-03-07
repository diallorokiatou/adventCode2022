package org.adventOfCode.day4.campCleanup;

public class CampCleanup {

    public boolean isSectionsContainsEachOther(Section section1, Section section2) {
        return !section1.isContains(section2) && !section2.isContains(section1);
    }

}
