package com.codingblocks.Lecture_17;

public class Main {
    public static void main(String[] args) {
        BSTBalanced<Integer> bst = new BSTBalanced<>();

        for (int i = 0; i < 100000000; i++) {
            bst.add(i);
        }

        System.out.println(bst.height());

//        bst.display();

//        bst.add(10);
//        bst.add(5);
//        bst.add(7);
//
//        bst.display();
//
//        System.out.println();
//
//        bst.rightRotation();
//
//        bst.display();
//
//        System.out.println();
//
//        bst.leftRotation();
//
//        bst.display();


    }
}
