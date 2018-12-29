package com.codingblocks.lecture_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);

        dice(new StringBuilder(), 20);

//        String line = s.nextLine();

//        printSubSeq("", line);
    }

    public static void printSubSeq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            if (!processed.isEmpty()) {
                System.out.println(processed);
            }
            return;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        printSubSeq(processed, unprocessed);
        printSubSeq(processed + first, unprocessed);


    }

    public static void printSubSeqASCII(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            if (!processed.isEmpty()) {
                System.out.println(processed);
            }
            return;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        printSubSeqASCII(processed, unprocessed);
        printSubSeqASCII(processed + first, unprocessed);
        printSubSeqASCII(processed + (int)first, unprocessed);


    }

    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';

        unprocessed = unprocessed.substring(1);

        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {

            if (i == 26){
                continue;
            }

            char ch = (char)(i+'a');

            numpad(processed + ch, unprocessed);
        }

//        numpad(processed + (char)('a' + 3 * (digit - 1)), unprocessed);
//        numpad(processed + (char)('a' + 3 * (digit - 1) + 1), unprocessed);
//        if (digit != 9) {
//            numpad(processed + (char) ('a' + 3 * (digit - 1) + 2), unprocessed);
//        }
    }

    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
           String first = processed.substring(0, i);
           String last = processed.substring(i);

           permutation(first + ch + last, unprocessed);
        }
    }

    public static void dice(StringBuilder processed, int target){
        if (target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            processed.append(i);
            dice(processed, target - i);
            processed.deleteCharAt(processed.length() - 1);
        }
    }

    public static void permuteBuilder(StringBuilder processed, StringBuilder unprocessed){
        if (unprocessed.length() == 0){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed.deleteCharAt(0);

        for (int i = 0; i <= processed.length() ; i++) {
            processed.insert(i, ch);
            permuteBuilder(processed, unprocessed);
            processed.deleteCharAt(i);
        }

        unprocessed.insert(0, ch);
    }
}
