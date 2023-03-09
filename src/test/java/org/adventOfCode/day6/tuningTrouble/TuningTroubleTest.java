package org.adventOfCode.day6.tuningTrouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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


    private boolean isMarker(String signalBuffer) {
        return signalBuffer.length() >= 4 && signalBuffer.chars().distinct().count() == signalBuffer.length();
    }

}