package com.dailyprogrammer.challenges.challenge077;


import com.dailyprogrammer.challenges.challenge077.implementation.Morse;

public class Main {

    private static final char DOT = '.';
    private static final char DASH = '-';
    public static String joined = ""+DOT+DASH;

    public static String choice = "-.";


    public static void main(String[] args) {

        System.out.println(Morse.morse(5));

    }
}
