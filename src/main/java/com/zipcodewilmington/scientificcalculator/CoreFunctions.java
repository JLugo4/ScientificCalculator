package com.zipcodewilmington.scientificcalculator;

public class CoreFunctions {
    private double currentValue = 0;

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

    CoreFunctions coreFunctions = new CoreFunctions();

    public void add(double num1, double num2) {
        currentValue += (num1 + num2);
    }

    public void subtract(double num1, double num2) {
        currentValue -= (num1 - num2);
    }

    public void multiply(double num1, double num2) {
        currentValue *= (num1 * num2);
    }

    public void divide(double num1, double num2) {
        if(num2 ==0){
            System.out.println("Err");
            clearDisplay();
        } else {
            currentValue = num1 / num2;
        }
    }
    public double sqrRt(double num){
      // currentValue = (Math.sqrt(num));
        return (Math.sqrt(num));
    }
    public double sqrNum(double num){
        return num * num;
    }
    public double exponent(double base, double exp){
        return (int)Math.pow(base,exp);
    }
    public double inverse(double num){
        return 1 / num;
    }
    public void invertSign(){
        currentValue *= -1;
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

