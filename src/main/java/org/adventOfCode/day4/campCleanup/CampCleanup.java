package org.adventOfCode.day4.campCleanup;

import java.util.List;

public class CampCleanup {

    private List<Pairs> pairs;

    public CampCleanup(Pairs ...pairs) {
        this.pairs = List.of(pairs);
    }

    public int countOfPairsFullyContainsEachOther() {
        return (int) this.pairs.stream().filter(Pairs::isSectionsContainsEachOther).count();
    }

}
