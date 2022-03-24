package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        System.out.println("\n8.1 Exceptions\n");

        FileReader fileReader = new FileReader();
        fileReader.readFile();

    }

}
