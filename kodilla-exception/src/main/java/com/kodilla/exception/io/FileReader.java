package com.kodilla.exception.io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileReader {

    public void readFile(String fileName) {

        try {
            String data = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println(data);


        } catch (IOException e) {
            System.out.println("Oh no! Something went wrong! Error " + e);


        } finally {
            System.out.println("I am gonna be here... always!");
        }

    }
}