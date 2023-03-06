package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        /*Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);*/

        CoreFunctions coreFunctions = new CoreFunctions();
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double userInput = scanner.nextInt();
        coreFunctions.setCurrentValue(userInput) ;
        System.out.println(coreFunctions.currentValue);
        
    }
}
