package com.kodilla.exception.main;


import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;



public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();
        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();



        try {
            fileReader.readFile("C:\\Users\\Błażej\\Documents\\Development\\Projects\\kodilla-course\\kodilla-exception\\out\\production\\resources\\file\\names.txt");


        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");


        }

    }

}