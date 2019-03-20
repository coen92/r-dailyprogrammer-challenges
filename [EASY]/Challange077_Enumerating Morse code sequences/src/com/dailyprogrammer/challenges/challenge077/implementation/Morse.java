package com.dailyprogrammer.challenges.challenge077.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Morse {

    private static final char DOT = '.';
    private static final char DASH = '-';
    private static int charPosition = 0;

    public static ArrayList<String> morse(int value) {

        String choice = "" + DOT + DASH;
        StringBuilder builder;
        ArrayList<String> results = new ArrayList<>();
        int expectedValue = 0;
        boolean flag = true;

//        i=expectedValue; i<=value; i+=morseResult(builder.charAt(charPosition++))
        while(flag) {
            String resetBuilder = "";
            builder = new StringBuilder(resetBuilder);
            System.out.println(builder);

            while(value!=expectedValue) {
                if(value - expectedValue == 1){
                    builder.append(DOT);
                } else {
                    builder.append(selectAChar(choice));
                }
                System.out.println(builder);
                expectedValue += morseResult(builder.charAt(charPosition++));
                System.out.println(expectedValue);
            }

            String result = new String(builder);
            System.out.println(result);

            if(!results.contains(result)) {
                results.add(result);
                expectedValue = 0;
                charPosition = 0;
            } else {

                //THIS CODE HAS TO BE CHANGED
                for(int i=0; i<results.size(); i++) {
                    String[] checkers = new String[results.size()];
                    checkers[i] = permute(results.get(i), 0, results.get(i).length()-1);
                    for(int j=0; j<checkers.length; j++) {
                        checkers[j] = checkers[i];
                        if (results.contains(Arrays.asList(checkers).get(j))) {
                            flag = false;
                        }
                    }
                }
                //--------------------------------------
                expectedValue = 0;
                charPosition = 0;
                continue;
            }
            System.out.println(Arrays.toString(results.toArray()));
        }
        return results;
    }

    private static int morseResult(char mark) {

        if(mark == DOT) {
            return 1;
        } else if(mark == DASH) {
            return 2;
        } else
            return -1;
    }

    private static char selectAChar(String s) {

        Random random = new Random();
        int index = random.nextInt(s.length());
        return s.charAt(index);
    }

    private static String permute(String string, int start, int end) {

        if(start == end) {
            System.out.println(string);
        } else {

            for(int i=start; i<=end; i++) {

                string = swap(string, start, i);
                permute(string, start+1, end);
                string = swap(string, start, end);
            }
        }
        return string;
    }

    private static String swap(String input, int i, int j) {

        char temp;
        char[] charArray = input.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
