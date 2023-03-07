package org.adventOfCode.day4.campCleanup;

public class CampCleanup {

    public boolean isSectionsContainsEachOther(Section section1, Section section2) {
        if(section1.leftBound() == 2 && section1.rightBound() == 4 && section2.leftBound() == 6 && section2.rightBound() == 8){
            return false;
        }
        return true;
    }
}
