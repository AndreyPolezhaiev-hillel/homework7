package com.hillel.polezhaiev;

public class StringFunctions {
    public StringFunctions() {

    }

    public int findSymbolOccurance(String str, char sym){
        int counter = 0;
        char [] result = str.toCharArray();

        if(str.length() == 0){
            return 0;

        }

        for (int i = 0; i < result.length; i++) {
            if(result[i] == sym){
                counter++;

            }
        }
        return counter;
    }

    public int findWordPosition(String source, String target){
        return source.indexOf(target);

    }

    public String stringReverse(String nRev){
        if(nRev.length() == 0){
            return "";

        }

        String result = "";

        for (int i = nRev.length() - 1; i >= 0; i--) {
            result += nRev.charAt(i);

        }
        return result;
    }

    public boolean isPalindrome(String str){

        char [] result = str.toCharArray();

        for (int i = 0; i < result.length / 2; i++) {
            if(!(result[i] == result[result.length - i - 1])){
                return false;

            }
        }
        return true;

    }
}
