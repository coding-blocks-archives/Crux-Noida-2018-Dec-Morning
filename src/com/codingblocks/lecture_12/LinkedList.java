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

    public String deleteFirst() throws Exception{
        if (size == 0){
            throw new Exception("Removing from empty list");
        }

        String value = head.value;

        head = head.next;

        if (head == null){
            tail = head;
        }

        size--;

        return value;
    }

    public String deleteLast() throws Exception{
        if (size < 2){
            return deleteFirst();
        }

        Node node = head;

        while (node.next != tail){
            node = node.next;
        }

        // now node have second last item

        String value = tail.value;

        // second last item is now last item
        node.next = null;

        // point tail to node
        tail = node;

        size--;

        return value;
    }

    public void insertLast(String value){

        if (size == 0){
            insertFirst(value);
            return;
        }

        // create new node
        Node node = new Node(value);

        // shift tail to new node
        tail.next = node;
        tail = node;

        // increase size
        size++;
    }

    public String get(int index) throws Exception{

        if (index < 0 || index >= size){
            throw new Exception("Index out of bound");
        }

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.value;
    }

    public Node getNode(int index) throws Exception{

        if (index < 0 || index >= size){
            throw new Exception("Index out of bound");
        }

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void insert(int index, String value) throws Exception{
        if (index == 0){
            insertFirst(value);
            return;
        }

        if (index == size){
            insertLast(value);
            return;
        }

        Node prev = getNode(index - 1);

        Node node = new Node(value, prev.next);
        prev.next = node;

        size++;
    }

    public void display(){

        Node node = head;

        while (node != null){
            System.out.print(node.value + ", ");
            node = node.next;
        }

        System.out.println("END");
    }

    public String delete(int index) throws Exception{
        if (index == 0){
            return deleteFirst();
        }

        if (index == size - 1){
            return deleteLast();
        }

        Node prev = getNode(index - 1);

        String value = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return value;
    }


    private class Node {
        private String value;
        private Node next;

        private Node(String value) {
            this.value = value;
        }

        private Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
