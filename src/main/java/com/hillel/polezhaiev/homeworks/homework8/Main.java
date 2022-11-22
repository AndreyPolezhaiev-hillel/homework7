package com.hillel.polezhaiev.homeworks.homework8;

public class Main {
    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String [][] strings = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        System.out.println("Sum of array's elements: " + calculator.doCalc(strings));

    }
}
