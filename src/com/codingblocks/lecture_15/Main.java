package com.codingblocks.lecture_15;


public class Main {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list1 = new GenericLinkedList<>();


        list1.insertLast(5);
        list1.insertLast(6);
        list1.insertLast(7);
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);

        list1.display();

//        list1.kreverse(3);

        list1.bubble();

        list1.display();
//
//        GenericLinkedList<Integer> list2 = new GenericLinkedList<>();
//
//        list2.insertLast(5);
//        list2.insertLast(15);
//        list2.insertLast(25);


//        GenericLinkedList<Integer> l3 = list1.merge(list2);
//
//        l3.display();


//        System.out.println("Apple".compareTo("Ample"));

    }
}
