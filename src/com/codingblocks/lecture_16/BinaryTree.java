package com.codingblocks.lecture_16;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void generate(){
        Scanner s = new Scanner("10 true 7 true 3 false false true 8 false false true 13 false false");
        System.out.print("Enter root node :");
        int value = s.nextInt();

        root = new Node(value);

        generate(root, s);
    }

    private void generate(Node node, Scanner s){
        System.out.print("Do you want to add left of " + node.value);
        boolean left = s.nextBoolean();

        if (left){
            System.out.print("Enter left node  of " + node.value);
            int value = s.nextInt();
            node.left = new Node(value);
            generate(node.left, s);
        }

        System.out.print("Do you want to add right of " + node.value);
        boolean right = s.nextBoolean();

        if (right){
            System.out.print("Enter right node  of " + node.value);
            int value = s.nextInt();
            node.right = new Node(value);
            generate(node.right, s);
        }
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
