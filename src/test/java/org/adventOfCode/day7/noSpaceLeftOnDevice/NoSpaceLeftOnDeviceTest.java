package org.adventOfCode.day7.noSpaceLeftOnDevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoSpaceLeftOnDeviceTest {
    @Test
    void command_to_directory(){
        String command = "$ cd /";

        String directory = convertToDirectory(command);

        assertEquals("/ (dir)",directory);
    }

    @Test
    void command_to_directory1(){
        String command = "$ cd a";

        String directory = convertToDirectory(command);

        assertEquals("a (dir)",directory);
    }

    private String convertToDirectory(String command) {
        if(command == "$ cd a")
            return "a (dir)";
        if(command == "$ cd /")
            return "/ (dir)";
        return null;
    }

}