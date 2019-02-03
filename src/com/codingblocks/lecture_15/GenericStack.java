package com.codingblocks.lecture_15;

import java.util.LinkedList;

public class GenericStack<T extends Comparable<T>> {

    LinkedList<T> list = new LinkedList();

    public void push(T value){
        list.addFirst(value);
    }

    public T pop(){
        return list.removeFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
