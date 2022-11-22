package com.hillel.polezhaiev.homeworks.homework8;

public class ArrayValueCalculator {

    public int doCalc(String [][] arr) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if(arr.length > 4 || arr.length < 4 || arr[0].length > 4 || arr[0].length < 4){
            throw new ArraySizeException();
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i]. length; j++){
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Exception at arr[" + i + "][" + j + "]");

                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }

        return sum;
    }
}
