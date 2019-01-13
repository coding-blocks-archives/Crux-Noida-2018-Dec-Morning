package com.codingblocks.lecture_12;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;


    public void insertFirst(String value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size++;

    }

    public void display(){

        Node node = head;

        while (node != null){
            System.out.print(node.value + ", ");
            node = node.next;
        }

        System.out.println("END\b");
    }


    private class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
