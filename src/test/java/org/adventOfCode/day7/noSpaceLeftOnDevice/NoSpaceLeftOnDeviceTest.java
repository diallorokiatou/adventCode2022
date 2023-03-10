package org.adventOfCode.day7.noSpaceLeftOnDevice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
            List<String> fileInfos = Arrays.stream(command.trim().split("\n"))
                    .filter(string -> !string.startsWith("ls"))
                    .map(String::trim)
                    .map(string -> string.split(" "))
                    .flatMap(Arrays::stream)
                    .toList();
            return  fileInfos.get(1) + " (file, size=" + fileInfos.get(0) + ")";
        }
        String directory = command.split("cd")[1];
        return directory.trim() + " (dir)";
    }

}