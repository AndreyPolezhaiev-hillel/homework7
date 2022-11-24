package com.hillel.polezhaiev.homeworks.homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String [][] strings = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3"},
                {"4", "4", "4", "4"}
        };

        int choice = choice();

        switch(choice){
            case 1:
                System.out.println("Sum of array's elements: " + calculator.doCalc(strings));
                break;

            case 2:
                strings[1][1] = "not a number";
                System.out.println("Sum of array's elements: " + calculator.doCalc(strings));
                strings[1][1] = "2";
                break;

            case 3:
                strings[1][1] = null;
                System.out.println("Sum of array's elements: " + calculator.doCalc(strings));
                strings[1][1] = "2";
                break;

            case 4:
                strings = new String[][]{
                        {"1", "1", "1", "1"},
                        {"2", "2", "2", "2"},
                        {"3", "3", "3", "3"}
                };
                System.out.println("Sum of array's elements: " + calculator.doCalc(strings));
                break;

        }


    }

    private static int choice(){
        System.out.println("Enter 1, 2, 3 or 4");
        System.out.println("1 - correct work");
        System.out.println("2 - one of array's elements is STRING");
        System.out.println("3 - one of array's element is NULL");
        System.out.println("4 - length doesn't equal 4*4");
        System.out.print("Enter a value: ");

        while(true){
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if(choice == 1 || choice == 2 || choice == 3 || choice == 4){
                System.out.println();
                return choice;

            } else {
                System.out.print("Enter 1, 2, 3 or 4: ");

            }
        }
    }

}
