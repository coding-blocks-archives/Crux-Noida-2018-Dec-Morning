package com.codingblocks.Lecture_17;

import com.codingblocks.lecture_16.BinaryTreeGeneric;

public class BST <T extends Comparable<T>> {


    private Node root;

    public void add(T value){
        this.root = add(value, root);
    }

    private Node add(T value, Node node){
        if(node == null){
            return new Node(value);
        }

        if (node.value.compareTo(value) > 0){
            node.left = add(value, node.left);
        }


        if (node.value.compareTo(value) < 0){
            node.right = add(value, node.right);
        }


        // balancing code

        return node;
    }

    public void generate(T[] values){
        this.root = generate(values, 0, values.length);
    }

    private Node generate(T[] values, int start, int end) {
        if (start >= end){
            return null;
        }

        int mid = (start + end)/2;

        Node node = new Node(values[mid]);

        node.left = generate(values, start, mid);
        node.right = generate(values, mid + 1, end);

        return node;
    }

    public void display(){
        display(root, "", "root");
    }

    private void display(Node node, String indent, String type){
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);

        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }


    public T min(){

        if (root == null){
            return null;
        }

        Node node = root;

        while (node.left != null){
            node = node.left;
        }

        return node.value;
    }

    public T max(){

        if (root == null){
            return null;
        }

        return max(root).value;
    }

    public boolean find(T value){

        Node node = root;

        while (node != null){
            if (node.value.compareTo(value) > 0){
                node = node.left;
            } else if (node.value.compareTo(value) < 0){
                node = node.right;
            } else {
                return true;
            }
        }

        return false;
    }

    private Node max(Node node){
        if (node.right == null){
            return node;
        }

        return max(node.right);
    }

    public void range(T start, T end){
        range(root, start, end);
    }

    private void range(Node node, T start, T end) {
        if (node == null){
            return;
        }

        if (node.value.compareTo(start) >= 0) {
            range(node.left, start, end);
        }

        if (node.value.compareTo(start) >= 0 && node.value.compareTo(end) <= 0) {
            System.out.print(node.value + " ");
        }

        if (node.value.compareTo(end) <= 0){
            range(node.right, start, end);
        }
    }

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }


}
