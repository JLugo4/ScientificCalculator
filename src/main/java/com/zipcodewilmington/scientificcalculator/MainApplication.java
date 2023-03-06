package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        int value = 8;
        while (value == 8) {

            CoreFunctions coreFunctions = new CoreFunctions();
            ScientificFunctions scientificFunctions = new ScientificFunctions();

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to manipulate");
            int userInput = scanner.nextInt();
            coreFunctions.setCurrentValue(userInput);


            System.out.println("Please choose a function:\n " +
                    "1 Addition\n" +
                    "2 Subtraction\n" +
                    "3 Division\n" +
                    "4 Multiplication\n" +
                    "5 Square Root\n" +
                    "6 Number Squared\n" +
                    "7 Exponentiation\n" +
                    "8 Inverse of Number\n" +
                    "etc....");

            int userInput2 = scanner.nextInt();

            switch (userInput2) {
                case 1:
                    coreFunctions.add(scanner.nextInt());
                    break;
                case 2:
                    coreFunctions.subtract(scanner.nextInt());
                    break;
                case 3:
                    coreFunctions.divide(scanner.nextInt());
            }
            System.out.println(coreFunctions.currentValue);
        }
    }
}