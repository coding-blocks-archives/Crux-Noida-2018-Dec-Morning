package com.codingblocks.lecture_15;


public class Main {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list1 = new GenericLinkedList<>();

        list1.insertLast(12);
        list1.insertLast(22);
        list1.insertLast(32);

        GenericLinkedList<Integer> list2 = new GenericLinkedList<>();

        list2.insertLast(5);
        list2.insertLast(15);
        list2.insertLast(25);


        GenericLinkedList<Integer> l3 = list1.merge(list2);

        l3.display();


//        System.out.println("Apple".compareTo("Ample"));

    }
}
