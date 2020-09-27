package org.example.app;

import org.example.app.generator.ErrorGenerator;
import org.example.app.generator.HeapMemoryErrorGenerator;
import org.example.app.generator.MetaSpaceErrorGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextLine());
        }

        //generator implementation is to be chosen
        ErrorGenerator generator = new MetaSpaceErrorGenerator();
        generator.generate(1000_000);
    }
}
