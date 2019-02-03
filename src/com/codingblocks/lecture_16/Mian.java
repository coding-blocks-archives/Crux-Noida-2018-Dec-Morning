package com.codingblocks.lecture_16;

import java.util.Arrays;
import java.util.TreeSet;

public class Mian {
    public static void main(String[] args) {
//        BinaryTreeGeneric<String> tree = new BinaryTreeGeneric<>();
//
//        String[] pre = {"ten", "seven", "three", "eight", "thirteen"};
//        String[] in = {"three", "seven", "eight", "ten", "thirteen"};
//
//        tree.genPreIn(pre, in);
//
//        tree.display();

        Human anuj = new Human("Anuj", 24);
        Human mohit = new Human("Mohit", 22);
        Human shobhit = new Human("Shobhit", 26);

//        System.out.println(anuj.compareTo(mohit));

        Human[] insaan = {anuj, mohit, shobhit};

        Arrays.sort(insaan);

        System.out.println(Arrays.toString(insaan));

//        tree.generate();
//
//        System.out.println();
//
//        tree.preOrder();
//
//        System.out.println();
//
//        tree.inOrder();


    }
}
