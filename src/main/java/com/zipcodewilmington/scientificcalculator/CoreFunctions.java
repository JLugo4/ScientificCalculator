package com.zipcodewilmington.scientificcalculator;

public class CoreFunctions {
    public double currentValue = 0;

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double newValue) {
        currentValue = newValue;
    }
    public void clearDisplay(){
        currentValue = 0;
    }
    public void addDisplay(double num){
        currentValue += num;
    }

    public double add(double num1) {
        currentValue += (num1);
        return currentValue;
    }

    public double subtract(double num1) {
        currentValue -= (num1);
        return currentValue;
    }

    public double multiply(double num1) {

        currentValue *= (num1);
        return currentValue;
    }

    public double divide(double num1) {
        if(num1 == 0){
            System.out.println("Err");
            clearDisplay();
        } else {
            currentValue /= num1;
        }
        return currentValue;
    }
    public double sqrRt(){
        currentValue = (Math.sqrt(currentValue));
        return currentValue;
    }
    public double sqrNum(){

        return currentValue *= currentValue;
    }
    public double exponent(double exp){
        currentValue = Math.pow(currentValue, exp);
        return (currentValue);
    }
    public double inverse(){
        return 1 / currentValue;
    }
    public double invertSign(){

        return currentValue *= -1;
    }
    public void clearErr(){
        currentValue = 0;
        boolean error = false;
    }
    /*public void divisionError(double num1, double num2){
        try{
            currentValue /= ( num1 / num2);
        } catch (ArithmeticException e){
            currentValue = 0;
            System.out.println("Err" + e.getMessage());
            setCurrentValue(Integer.MIN_VALUE);
        }
    } */
}

