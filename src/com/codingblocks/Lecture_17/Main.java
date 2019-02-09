package com.codingblocks.Lecture_17;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(6);

        bst.display();
    }
}
