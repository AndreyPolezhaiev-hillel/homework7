package com.hillel.polezhaiev;


public class Main {
    public static void main(String[] args) {

        StringFunctions function = new StringFunctions();
        FieldOfDreamsGame game = new FieldOfDreamsGame();

        System.out.println(function.findSymbolOccurance("or1tt1o", '1'));
        System.out.println("////////////////////////////");
        System.out.println();
        System.out.println(function.findWordPosition("hello", "llo"));
        System.out.println("////////////////////////////");
        System.out.println();
        System.out.println(function.stringReverse("qwerty"));
        System.out.println("////////////////////////////");
        System.out.println();
        System.out.println(function.isPalindrome("12321"));
        System.out.println("////////////////////////////");
        System.out.println();

        game.printFruits();
        game.check(game.getWord());

    }

}
