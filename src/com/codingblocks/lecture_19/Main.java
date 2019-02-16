package com.codingblocks.lecture_19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Integer[] arr = {543, 765, 76, 8654, 87654};

        Human[] humans = {new Human("anuj", 24, 100), new Human("mohit", 24, 100)};
        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));

//        Heap<Integer> queue = new Heap<>();
//
//        queue.add(7);
//        queue.add(6);
//        queue.add(5);
//        queue.add(4);
//
////        while (!queue.isEmpty()){
//            System.out.println(queue.remove());
////        }
//
//        queue.add(1);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());


    }
}
