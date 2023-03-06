package com.zipcodewilmington.scientificcalculator;

import java.io.*;
import java.util.*;

public class ScientificFunctions {
    private int displayModeCounter = 0;
    private double currentValue = 0;
    private double memory = 0;
    private int numA = 0;
    private int numB = 0;
    private double inverseNumA = 0;
    private double inverseNumB = 0;
    public int unitsMode = 0;

    public void setInt() {
        String tempA = "";
        String tempB = "";
        if (displayModeCounter == 0) {
            numA = Integer.parseInt(Integer.toBinaryString(numA));
            numB = Integer.parseInt(Integer.toBinaryString(numB));
        } else if (displayModeCounter == 1) {
            numA = Integer.parseInt(Integer.toOctalString(numA));
            numB = Integer.parseInt(Integer.toOctalString(numB));
        } else if (displayModeCounter == 3) {
            numA = Integer.parseInt(Integer.toHexString(numA));
            numB = Integer.parseInt(Integer.toHexString(numB));
        }
    }

    public void switchUnitsMode() {
        if (unitsMode == 0) {
            System.out.println("Switched mode to radians");
            unitsMode = 1;
        } else if (unitsMode == 1) {
            System.out.println("Switch mode to degrees");
            unitsMode = 0;
        }
    }

    public void switchUnitsMode(String mode) {
        if (mode.equalsIgnoreCase("radians")) {
            System.out.println("Switched to radians");
            unitsMode = 1;
        } else if (mode.equalsIgnoreCase("degrees")) {
            System.out.println("Switched to degrees");
            unitsMode = 0;
        }
    }

    public int switchDisplayMode() {
        if (displayModeCounter == 0) {
            System.out.println("Switching to binary");
            displayModeCounter = 1;
        } else if (displayModeCounter == 1) {
            System.out.println("Switching to octal");
            displayModeCounter = 2;
        } else if (displayModeCounter == 2) {
            System.out.println("switching to decimal");
            displayModeCounter = 3;
        } else if (displayModeCounter == 3) {
            System.out.println("Switching to hexidecimal");
            displayModeCounter = 0;
        }
        return displayModeCounter;
    }

    public int switchDisplayMode(String Mode) {
        if (Mode.equalsIgnoreCase("binary")) {
            System.out.println("Switching to binary");
            displayModeCounter = 1;
        } else if (Mode.equalsIgnoreCase("octal")) {
            System.out.println("Switching to octal");
            displayModeCounter = 2;
        } else if (Mode.equalsIgnoreCase("decimal")) {
            System.out.println("Switching to decimal");
            displayModeCounter = 3;
        } else if (Mode.equalsIgnoreCase("hexidecimal")) {
            System.out.println("Switching to hexidecimal");
            displayModeCounter = 0;
        }
        return displayModeCounter;
    }

    public double mPlus() {
        memory = currentValue;
        System.out.println("Value successfully stored");
        return memory;

    }

    public void MC() {
        memory = 0;
        System.out.println("Memory successfully cleared");
    }

    public void MCR() {
        System.out.println(memory);
    }

    public double sine(double a) {
        inverseNumA = a;
        if (unitsMode == 0) {
            currentValue = Math.sin(Math.toRadians(inverseNumA));
        } else if (unitsMode == 1) {
            currentValue = Math.sin(inverseNumA);
        }
        return currentValue;
    }

    public double cosine(double a) {
        inverseNumA = a;
        if (unitsMode == 0) {
            currentValue = Math.cos(Math.toRadians(inverseNumA));
        } else if (unitsMode == 1) {
            currentValue = Math.cos(inverseNumA);
        }
        return currentValue;
    }

    public double tangent(double a) {
        inverseNumA = a;
        if (unitsMode == 0) {
            currentValue = Math.tan(Math.toRadians(inverseNumA));
        } else if (unitsMode == 1) {
            currentValue = Math.tan(inverseNumA);
        }
        return currentValue;
    }

    public double inverseSine(double a) {
        inverseNumA = a;
        if (unitsMode == 0) {
            currentValue = Math.asin(Math.toRadians(inverseNumA));
        } else if (unitsMode == 1) {
            currentValue = Math.asin(inverseNumA);
        }
        return currentValue;
    }

    public double inverseCosine(double a) {
        inverseNumA = a;
        if (unitsMode == 0) {
            currentValue = Math.acos(Math.toRadians(inverseNumA));
        } else if (unitsMode == 1) {
            currentValue = Math.acos(inverseNumA);
        }
        return currentValue;
    }

    public double inverseTangent(double number) {
        inverseNumA = number;
        if (unitsMode == 0) {
            currentValue = Math.atan(Math.toDegrees(inverseNumA));
        } else if (unitsMode == 1) {
            currentValue = Math.atan(inverseNumA);
        }
        return currentValue;
    }

    public double log(double number) {
        if (number > 0) {
            inverseNumA = number;
            currentValue = Math.log10(inverseNumA);
        } else {
            System.out.println("Err");
        }
        return currentValue;
    }

    public double inverseLog(double base, double exponent) {
        if (base > 0) {
            inverseNumA = base;
            inverseNumB = exponent;
            currentValue = Math.pow(inverseNumA, inverseNumB);
        } else {
            System.out.println("Err");
        }
        return currentValue;
    }

    public double naturalLog(double number) {
        if (number > 0) {
            inverseNumA = number;
            currentValue = Math.log(inverseNumA);
        } else {
            System.out.println("Err");
        }
        return currentValue;
    }

    public double inverseNaturalLog(double number) {
        if (number > 0) {
            inverseNumA = number;
            currentValue = Math.exp(inverseNumA);
        } else {
            System.out.println("Err");
        }
        return currentValue;
    }

    public double factorial(int number) {
        int temp = 1;
        for (int i = 1; i <= number; i++) {
            temp = temp * i;
        }
        currentValue = temp;
        return currentValue;
    }

    public double getHypotenuse(double number1, double number2) {
        inverseNumA = number1;
        inverseNumB = number2;
        double temp = Math.pow(inverseNumA, 2) + Math.pow(inverseNumB, 2);
        currentValue = Math.sqrt(temp);
        return currentValue;
    }

    public double getCircleArea(double number) {
        inverseNumA = number;
        currentValue = Math.PI * (Math.pow(inverseNumA, 2));
        return currentValue;
    }
}