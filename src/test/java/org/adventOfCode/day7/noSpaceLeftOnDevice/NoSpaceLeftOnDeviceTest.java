package org.adventOfCode.day7.noSpaceLeftOnDevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoSpaceLeftOnDeviceTest {
    @Test
    void convert_command_cd(){
        String command = "$ cd /";

        String directory = convertToDirectory(command);

        assertEquals("/ (dir)",directory);
    }

    @Test
    void convert_command_cd1(){
        String command = "$ cd a";

        String directory = convertToDirectory(command);

        assertEquals("a (dir)",directory);
    }

    @Test
    void convert_command_ls(){
        String command = """
                        ls 
                        584 i
                """;

        String directory = convertToDirectory(command);

        assertEquals("i (file, size=584)",directory);
    }

  /*  @Test
    void convert_command_ls1(){
        String command = """
                        ls 
                        dir xyz
                """;

        String directory = convertToDirectory(command);

        assertEquals(" xyz (dir)",directory);
    }*/

    private String convertToDirectory(String command) {
        if(command.trim().startsWith("ls")){
            String[] split = command.split("\n")[1].trim().split(" ");
            return split[1] + " (file, size=" + split[0] + ")";
        }
        String directory = command.split("cd")[1];
        return directory.trim() + " (dir)";
    }

}