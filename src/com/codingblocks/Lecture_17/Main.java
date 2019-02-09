package com.codingblocks.Lecture_17;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        Integer[] values = {1, 2, 3, 4, 5, 6,7};

        bst.generate(values);

        bst.range(6, 6);


    }
}
