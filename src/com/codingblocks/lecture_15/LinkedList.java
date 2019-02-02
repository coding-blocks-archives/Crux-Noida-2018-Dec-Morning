package com.codingblocks.lecture_15;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(String value){
        Node node = new Node(value, head);
        head = node;

        if (size == 0){
            tail = head;
        }

        size++;
    }

    public void insertLast(String value){
        // insert last is same to insert first for size 0
        if (size == 0){
            insertFirst(value);
            return;
        }

        // create new Node
        Node node = new Node(value);

        // point prev tail to new node
        tail.next = node;

        // make this as new tail node
        tail = node;

        size++;

    }

    public String deleteFirst(){
        if (size == 0){
            return null;
        }

        // save value to be ret
        String value = head.value;

        // delete the item
        head = head.next;

        size--;


        if (size == 0){
            tail = null;
        }

        return value;
    }

    public String deleteLast(){
        if (size < 2){
            return deleteFirst();
        }

        Node node = head;

        while (node.next.next != null){
            node = node.next;
        }

        String value = node.next.value;

        node.next = null;
        tail = node;

        size--;

        return value;
    }

    public Node get(int index){

        Node node  = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void insert(String value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }

        if (index == size){
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);

        Node node = new Node(value, prev.next);
        prev.next = node;

        size++;

    }

    public String delete(int index){
        if (index == 0){
            return deleteFirst();
        }

        if (index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);

        String value = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return value;
    }

    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }

        System.out.println("END");
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
