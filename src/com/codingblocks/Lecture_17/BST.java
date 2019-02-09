package com.codingblocks.Lecture_17;

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

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }


}
