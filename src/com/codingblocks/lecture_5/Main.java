package com.codingblocks.lecture_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Integer x = 7;
//        Integer y = 9;
//
//        swap(x, y);
//
//        System.out.println(x);
//        System.out.println(y);


        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.size());

        list.add(5);
        list.add(6);
        list.add(66);

        list.set(3, 77);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        System.out.println(list.get(3)); out of range not allowed
    }

    public static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
