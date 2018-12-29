package com.codingblocks.lecture_7;

import java.util.ArrayList;

public class RecReturn {

    public static void main(String[] args) {
        ArrayList<String> result = printSubSeqList("", "happy");

        System.out.println(result);
    }



    public static void printSubSeq(String processed, String unprocessed, ArrayList<String> list) {
        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty()) {
                list.add(processed);
            }
            return;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        printSubSeq(processed, unprocessed, list);
        printSubSeq(processed + first, unprocessed, list);

    }

    public static ArrayList<String> printSubSeqList(String processed, String unprocessed) {


        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!processed.isEmpty()) {
                list.add(processed);
            }
            return list;
        }

        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        ArrayList<String> left = printSubSeqList(processed, unprocessed);
        ArrayList<String> right = printSubSeqList(processed + first, unprocessed);

        left.addAll(right);

        return left;
    }

    public static ArrayList<String> numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';

        unprocessed = unprocessed.substring(1);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {

            if (i == 26){
                continue;
            }

            char ch = (char)(i+'a');

            list.addAll(numpad(processed + ch, unprocessed));
        }

        return list;

//        numpad(processed + (char)('a' + 3 * (digit - 1)), unprocessed);
//        numpad(processed + (char)('a' + 3 * (digit - 1) + 1), unprocessed);
//        if (digit != 9) {
//            numpad(processed + (char) ('a' + 3 * (digit - 1) + 2), unprocessed);
//        }
    }

}
