package com.codingblocks.lecture_5;

import java.util.ArrayList;

public class StringConcept {
    public static void main(String[] args) {
        String first ="ho ho ho";
        String second = "hello";

        String third = "world";
//
//        System.out.println(first.concat(third));

        System.out.println(first.indexOf('o', 1));

        System.out.println(find_all_occ(first, "ho"));

//
//        System.out.println(first.equals(second));
//
//        for (int i = 0; i < first.length(); i++) {
//            System.out.println(first.charAt(i));
//        }
//
//        System.out.println(first.substring(1, 1));
    }

    public static void subStrings(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length() ; j++) {
                System.out.println(line.substring(i, j));
            }
        }
    }

    public static ArrayList<Integer> find_all_occ(String line, String pattern){
        ArrayList<Integer> list = new ArrayList<>();

        int next = line.indexOf(pattern);

        while (next != -1 ){
            list.add(next);

            next = line.indexOf(pattern, next + 1);
        }


        return list;
    }
}
