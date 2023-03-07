package org.adventOfCode.day4.campCleanup;

public class CampCleanup {

    public boolean isSectionsContainsEachOther(Section section1, Section section2) {
        if(section1.leftBound() < section2.leftBound() && section1.rightBound() < section2.rightBound()){
            return false;
        }
        return true;
    }
}
