package org.adventOfCode.day4.campCleanup;

import java.util.Arrays;

public class CampCleanup {

    public boolean isSectionsContainsEachOther(Section section1, Section section2) {
        return section1.contains(section2) && section2.contains(section1);
    }

    public int sumOfPairsFullyContainsEachOther(Pairs ...pairs) {
        return (int) Arrays.stream(pairs).filter(Pairs::isSectionsContainsEachOther).count();
    }

}
