package com.codingblocks.lecture_12;

public class ListClient {

    public static void main(String[] args) throws Exception{
        LinkedList list = new LinkedList();


        list.insertFirst("Mohini");
        list.insertFirst("Mohit");
        list.insertLast("Harsh");

        list.display();

//        list.deleteLast();

        list.display();

        list.insert(2, "Ritu");
        list.insert(4, "Neha");

        list.display();

        System.out.println(list.get(0));
    }
}
