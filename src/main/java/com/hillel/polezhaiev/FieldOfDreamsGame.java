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

    public void printFruits(){
        System.out.println("IT IS A LITTLE COMPUTER GAME");
        System.out.println("Computer wondered a word from a basket of fruits:");
        System.out.println();

        for (int i = 0; i < words.length; i++) {

            if(i == words.length - 1){
                System.out.println(" " + words[i] + ".");
                break;

            }
            System.out.print(" " + words[i] + ",");

            if (i % 4 == 0 && i != 0){
                System.out.println();

            }
        }

        System.out.println();
        System.out.println("Your purpose to guess that word");
    }
    public boolean check(String arrayWord){
        Scanner scanner = new Scanner(System.in);
        String result = "##########";
        StringBuilder builder = new StringBuilder(result);

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

                for (int i = 0; i < arrayWord.length(); i++) {

                    if(i == arrayWord.length() || i == userWord.length()){
                        break;
                    }

                    if(userWord.charAt(i) == arrayWord.charAt(i)){
                        builder.setCharAt(i, arrayWord.charAt(i));

                    }
                }

                System.out.println("Wondered word is: " + builder);
                System.out.print("Try again: ");

            }

        }

    }
}
