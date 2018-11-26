package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;



public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();

        fileReader.readFile("C:\\Users\\Błażej\\Documents\\Development\\Projects\\kodilla-course\\kodilla-exception\\out\\production\\resources\\file\\names.txt");

    }

}

