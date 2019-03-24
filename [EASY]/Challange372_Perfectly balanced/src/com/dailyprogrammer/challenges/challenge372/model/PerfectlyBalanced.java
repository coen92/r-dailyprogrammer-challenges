package com.dailyprogrammer.challenges.challenge372.model;

public class PerfectlyBalanced {

    private static final char X = 'x';
    private static final char Y = 'y';

    public static boolean balanced(String initial) {

        StringBuilder builder = new StringBuilder(initial);
        int result = 0;

        for(int i=0; i<builder.length(); i++) {
            result += symbolValuation(builder.charAt(i));
        }

        if(result == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int symbolValuation(char mark) {
        if(mark == X) {
            return 1;
        } else if(mark == Y) {
            return -1;
        } else
            return 0;
    }
}
