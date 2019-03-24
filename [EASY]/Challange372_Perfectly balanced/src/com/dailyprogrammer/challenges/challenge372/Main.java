package com.dailyprogrammer.challenges.challenge372;

import com.dailyprogrammer.challenges.challenge372.model.PerfectlyBalanced;

public class Main {

    public static void main(String[] args) {

        System.out.println(PerfectlyBalanced.balanced("xyxyyxyyyyxxy"));
        System.out.println(PerfectlyBalanced.balanced("xyxxyxy"));
        System.out.println(PerfectlyBalanced.balanced("yyxyyyxyyyxyy"));
        System.out.println(PerfectlyBalanced.balanced(""));
        System.out.println(PerfectlyBalanced.balanced("yyxxyyyxxxyxyx"));
    }
}
