package com.codingblocks.lecture_18;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> dict = new HashMap<>();

        dict.put("apple", 20);
        dict.put("banana", 5);


        dict.put("apple", 30);

        System.out.println(dict.get("apple"));

//        dict.remove("apple");

        System.out.println(dict.get("apple"));


    }
}
