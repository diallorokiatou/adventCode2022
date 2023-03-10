package org.adventOfCode.day6.tuningTrouble;

import java.util.stream.IntStream;

public record TuningTrouble(String signalBuffer) {

    private static final int MINPACKETLENGHT = 4;
    private static final int ZEROPACKETLENGTH = 0;

    public int startOfPacket() {
        if(this.signalBuffer.length() <= MINPACKETLENGHT) {
            return this.signalBuffer.chars().distinct().count() == MINPACKETLENGHT ? MINPACKETLENGHT : ZEROPACKETLENGTH;
        }
        return  IntStream.range(ZEROPACKETLENGTH, this.signalBuffer.length() - MINPACKETLENGHT)
                .filter(index -> {
                        String packet = this.signalBuffer.substring(index, index + MINPACKETLENGHT);
                        return packet.chars().distinct().count() == MINPACKETLENGHT;
                }).map(index -> index + MINPACKETLENGHT).findFirst().orElse(ZEROPACKETLENGTH);
    }
}
