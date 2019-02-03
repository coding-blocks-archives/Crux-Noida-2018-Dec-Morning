package com.codingblocks.lecture_15;

import java.util.Stack;

public class GenericLinkedList<T extends Comparable<T>> {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(T value){
        Node node = new Node(value, head);
        head = node;

        if (size == 0){
            tail = head;
        }

        size++;
    }

    public void insertLast(T value){
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

    public T deleteFirst(){
        if (size == 0){
            return null;
        }

        // save value to be ret
        T value = head.value;

        // delete the item
        head = head.next;

        size--;


        if (size == 0){
            tail = null;
        }

        return value;
    }

    public T deleteLast(){
        if (size < 2){
            return deleteFirst();
        }

        Node node = head;

        while (node.next.next != null){
            node = node.next;
        }

        T value = node.next.value;

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

    public void insert(T value, int index){
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

    public T delete(int index){
        if (index == 0){
            return deleteFirst();
        }

        if (index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);

        T value = prev.next.value;

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

    public void reverse(){

        if (size < 2){
            return;
        }

//        reverse(head);

        Node prev = null;
        Node present = head;
        Node next = head.next;

        tail = head;

        while (present != null){
            present.next = prev;

            prev = present;
            present = next;

            if (next != null) {
                next = next.next;
            }
        }

        head = prev;
    }

    private void reverse(Node node) {

        if (node.next == null){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;


    }

    public GenericLinkedList<T> merge(GenericLinkedList<T> second){
        GenericLinkedList<T> list = new GenericLinkedList<>();

        Node f_node = this.head;
        Node s_node = second.head;

        while (f_node != null && s_node != null){
            if (f_node.value.compareTo(s_node.value) < 0){
                list.insertLast(f_node.value);
                f_node = f_node.next;
            } else {
                list.insertLast(s_node.value);
                s_node = s_node.next;
            }
        }

        while (f_node != null){
            list.insertLast(f_node.value);
            f_node = f_node.next;
        }

        while (s_node != null){
            list.insertLast(s_node.value);
            s_node = s_node.next;
        }

        return list;
    }


    public void kreverse(int k){

        GenericLinkedList<T> temp = new GenericLinkedList<>();

        Node node = head;

        Stack<Node> stack = new Stack<>();

        while (node != null) {

            for (int i = 0; i < k && node != null; i++) {
                stack.push(node);
                node = node.next;
            }

            while (!stack.empty()){
                Node top = stack.pop();
//
//                if (t_head == null){
//                    t_head = top;
//                    t_tail = top;
//                } else {
//                    t_tail.next = top;
//                    t_tail = top;
//                }
//
//                t_tail.next = null;
                temp.insertLast(top.value);
            }

            head = temp.head;
            tail = temp.tail;

        }


    }

    public void bubble(){

        if (size < 2){
            return;
        }

        for (int i = 0; i < size; i++) {
            Node node = head;

            for (int j = 0; j < size - i - 1; j++){
                if (node.value.compareTo(node.next.value) > 0){
                    T value = node.value;
                    node.value = node.next.value;
                    node.next.value = value;
                }

                node = node.next;
            }
        }
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
