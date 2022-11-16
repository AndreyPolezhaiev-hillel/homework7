package com.hillel.polezhaiev;

import java.util.Scanner;
public class FieldOfDreamsGame {

    private String[] words = {
            "apple", "orange", "lemon",
            "banana", "apricot", "avocado" , "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", " pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"
    };

    public FieldOfDreamsGame() {

    }
    private int min = 0;
    private int max = words.length - 1;
    private int randIndex = min + (int)(Math.random() * (max - min + 1));

    public String[] getWords() {
        return words;
    }

    public String getWord(){
        return words[randIndex];
    }

    public boolean check(String arrayWord){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word from a keyboard: ");

        while(true){
            String userWord = scanner.nextLine().trim();

            if(userWord.equalsIgnoreCase(arrayWord)){
                System.out.println();
                System.out.println("You won!!!");
                System.out.println("Wondered word was: " + arrayWord);
                System.out.println("GAME OVER)");
                return true;

            } else {
                System.out.println("You aren't right!");

                System.out.println(
                        "Wondered word is: " +
                                arrayWord.substring(0, 2) +
                                "########################");

                System.out.print("Try again: ");

            }

        }

    }
}
