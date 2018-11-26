package com.kodilla.exception.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderWithoutHandling {

    public void readFile(String fileName) throws IOException{

        String data = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println(data);


    }
}
