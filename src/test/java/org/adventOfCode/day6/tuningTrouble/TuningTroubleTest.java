package org.adventOfCode.day6.tuningTrouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuningTroubleTest {
    @Test
    void signal_buffer_under_4_char(){
        String signalBuffer = "mjq";

        boolean isStartOfPacket = new TuningTrouble(signalBuffer).isMarker(signalBuffer);

        assertFalse(isStartOfPacket);
    }

    @Test
    void is_not_a_marker(){
        String signalBuffer = "mjqj";

        boolean isStartOfPacket = new TuningTrouble(signalBuffer).isMarker(signalBuffer);

        assertFalse(isStartOfPacket);
    }

    @Test
    void is_a_marker(){
        String signalBuffer = "mjqa";

        boolean isStartOfPacket = new TuningTrouble(signalBuffer).isMarker(signalBuffer);

        assertTrue(isStartOfPacket );
    }

    @Test
    void first_stack_of_packet(){
        String signalBuffer = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";

        int startOfPacket = new TuningTrouble(signalBuffer).startOfParcket();

        assertEquals(7, startOfPacket);
    }

    @Test
    void first_stack_of_packet1(){
        String signalBuffer = "nppdvjthqldpwncqszvftbrmjlhg";

        int startOfPacket = new TuningTrouble(signalBuffer).startOfParcket();

        assertEquals(6, startOfPacket);
    }

    @Test
    void first_stack_of_packet2(){
        String signalBuffer = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";

        int startOfPacket = new TuningTrouble(signalBuffer).startOfParcket();

        assertEquals(11, startOfPacket);
    }

}