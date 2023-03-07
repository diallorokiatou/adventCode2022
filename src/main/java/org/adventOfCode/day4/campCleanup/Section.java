package org.adventOfCode.day4.campCleanup;

public record Section(int leftBound, int rightBound) {

    public static Section createSection(String range) {
        String[] bounds = range.split("-");
        return new Section(Integer.parseInt(bounds[0]), Integer.parseInt(bounds[1]));
    }

    boolean isContains(Section section) {
        return this.leftBound() >= section.leftBound() || this.rightBound() >= section.rightBound();
    }
}
