package org.adventOfCode.day6.tuningTrouble;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class TuningTroubleTest {
    @Test
    void signal_buffer_under_4_char(){
        String signalBuffer = "mjq";

        boolean isstartOfPacket = isMarker(signalBuffer);

        assertFalse(isstartOfPacket);
    }

    @Test
    void is_not_a_marker(){
        String signalBuffer = "mjqj";

        boolean isStartOfPacket = isMarker(signalBuffer);

        assertFalse(isStartOfPacket);
    }

    @Test
    void is_a_marker(){
        String signalBuffer = "mjqa";

        boolean isStartOfPacket = isMarker(signalBuffer);

        assertTrue(isStartOfPacket );
    }

    @Test
    void first_stack_of_packet(){
        String signalBuffer = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";

        int startOfPacket = startOfparcket(signalBuffer);

        assertEquals(7, startOfPacket);
    }

    @Test
    void first_stack_of_packet1(){
        String signalBuffer = "nppdvjthqldpwncqszvftbrmjlhg";

        int startOfPacket = startOfparcket(signalBuffer);

        assertEquals(6, startOfPacket);
    }

    @Test
    void first_stack_of_packet2(){
        String signalBuffer = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";

        int startOfPacket = startOfparcket(signalBuffer);

        assertEquals(11, startOfPacket);
    }

    private int startOfparcket(String signalBuffer) {
        return IntStream.range(0, signalBuffer.length() - 4).filter(index -> {
            String substring = signalBuffer.substring(index, index + 4);
            return isMarker(substring);
        }).map(index -> index + 4).findFirst().orElse(0);
    }

    private boolean isMarker(String signalBuffer) {
        return signalBuffer.length() >= 4 && signalBuffer.chars().distinct().count() == signalBuffer.length();
    }

}