package org.adventOfCode.day4.campCleanup;

public record Pairs(Section section1, Section section2) {

    public static Pairs createPairs(String range1, String range2) {
        Section section1 = Section.createSection(range1);
        Section section2 = Section.createSection(range2);
        return new Pairs(section1, section2);
    }

    public boolean isSectionsContainsEachOther() {
        return section1.isContains(section2) && section2.isContains(section1);
    }
}
