package com.codingblocks.lecture_16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeGeneric <T extends Comparable<T>>  {

    private Node root;

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

    public void inOrder(){
        inOrder(root);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + ", ");
        inOrder(node.right);
    }

    private void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.print(node.value + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + ", ");

    }

    public int diameter(){

        if (root == null){
            return 0;
        }

        return depth(root.left) + depth(root.right) + 3;
    }

    public int height(){
        return depth(root) + 1;
    }

    private int depth(Node node){
        if (node == null){
            return -1;
        }

        int max = Math.max(depth(node.left), depth(node.right));

        return max + 1;
    }

    public void levelOrder(){
        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node front = queue.remove();

            System.out.print(front.value + " ");

            if (front.left != null){
                queue.add(front.left);
            }

            if (front.right != null){
                queue.add(front.right);
            }
        }
    }

    public void genPreIn(T[] pre, T[] in){
        root = genPreInRec(pre, in);
    }

    private Node genPreInRec(T[] pre, T[] in) {
        if (pre.length == 0){
            return null;
        }

        T r = pre[0];

        int index = linear(in, r);

        Node node = new Node(r);

        T[] pre_left = Arrays.copyOfRange(pre, 1, index + 1);
        T[] pre_right = Arrays.copyOfRange(pre, index + 1, pre.length);

        T[] in_left = Arrays.copyOfRange(in, 0, index);
        T[] in_right = Arrays.copyOfRange(in, index + 1, in.length);

        node.left = genPreInRec(pre_left, in_left);
        node.right = genPreInRec(pre_right, in_right);

        return node;

    }

    private int linear(T[] nums, T value){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals(value)){
                return i;
            }
        }

        return -1;
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
