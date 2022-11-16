package com.hillel.polezhaiev;


public class Main {
    public static void main(String[] args) {

        StringFunctions function = new StringFunctions();
        FieldOfDreamsGame game = new FieldOfDreamsGame();

        System.out.println(function.findSymbolOccurance("or1tt1o", '1'));
        System.out.println("////////////////////////////");
        System.out.println();
        System.out.println(function.findWordPosition("hello", "he"));
        System.out.println("////////////////////////////");
        System.out.println();
        System.out.println(function.stringReverse("qwerty"));
        System.out.println("////////////////////////////");
        System.out.println();
        System.out.println(function.isPalindrome("qbcbq"));
        System.out.println("////////////////////////////");
        System.out.println();


        System.out.println("IT IS A LITTLE COMPUTER GAME");
        System.out.println("Computer wondered a word from a basket of fruits:");
        System.out.println();

        for (int i = 0; i < game.getWords().length; i++) {

            if(i == game.getWords().length - 1){
                System.out.println(" " + game.getWords()[i] + ".");
                break;

            }
            System.out.print(" " + game.getWords()[i] + ",");

            if (i % 4 == 0 && i != 0){
                System.out.println();

            }
        }

        System.out.println();
        System.out.println("Your purpose to guess that word");

        game.check(game.getWord());

    }

}
