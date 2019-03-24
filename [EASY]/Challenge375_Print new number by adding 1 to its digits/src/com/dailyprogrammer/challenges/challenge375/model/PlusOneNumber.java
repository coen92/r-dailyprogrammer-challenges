package com.dailyprogrammer.challenges.challenge375.model;

public class PlusOneNumber {

    public static long plusOneNumber(long initialNumber) {

        long resultNumber = 0;
        int numOfDigits = 0;

        while(initialNumber != 0) {

            long tempDigit = initialNumber % 10;

            resultNumber = (long)(resultNumber + (tempDigit + 1)* Math.pow(10, numOfDigits));

            numOfDigits++;
            if(tempDigit == 9) {
                numOfDigits += 1;
            }
            initialNumber /= 10;
        }
        return resultNumber;
    }


}
