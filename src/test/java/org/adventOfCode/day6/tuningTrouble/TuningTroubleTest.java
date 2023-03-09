package org.adventOfCode.day6.tuningTrouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TuningTroubleTest {
    @Test
    void signal_buffer_under_4_char(){
        String signalBuffer = "mjq";

        int isStartOfPacket = new TuningTrouble(signalBuffer).startOfPacket();

        assertEquals(0, isStartOfPacket);
    }

    @Test
    void do_not_contain_packet(){
        String signalBuffer = "mjqj";

        int isStartOfPacket = new TuningTrouble(signalBuffer).startOfPacket();

        assertEquals(0, isStartOfPacket);
    }

    @Test
    void contains_packet(){
        String signalBuffer = "mjqa";

        int isStartOfPacket = new TuningTrouble(signalBuffer).startOfPacket();

        assertEquals(4, isStartOfPacket);
    }

    @Test
    void first_stack_of_packet(){
        String signalBuffer = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";

        int startOfPacket = new TuningTrouble(signalBuffer).startOfPacket();

        assertEquals(7, startOfPacket);
    }

    @Test
    void first_stack_of_packet1(){
        String signalBuffer = "nppdvjthqldpwncqszvftbrmjlhg";

        int startOfPacket = new TuningTrouble(signalBuffer).startOfPacket();

        assertEquals(6, startOfPacket);
    }

    @Test
    void first_stack_of_packet2(){
        String signalBuffer = "zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";

        int startOfPacket = new TuningTrouble(signalBuffer).startOfPacket();

        assertEquals(11, startOfPacket);
    }

}