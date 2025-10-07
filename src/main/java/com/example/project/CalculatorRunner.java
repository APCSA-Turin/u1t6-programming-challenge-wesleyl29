package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        //2. call any methods of that class to test
        Calculator calc = new Calculator("T184");
        System.out.println(calc.performOperation("+",2,2));
        System.out.println(calc.divisibleBy(3,2));
        System.out.println(calc.coordinatePair(2,2));
        System.out.println(calc.average(5,2));
    }
}
