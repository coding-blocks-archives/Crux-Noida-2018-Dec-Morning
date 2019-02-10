package com.codingblocks.lecture_18;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashSet<E> {

    private ArrayList<LinkedList<Node>> data = new ArrayList<>();

    private int size = 0;

    private double limit = 5;

    public HashSet(){
        for (int i = 0; i < 10; i++) {
            data.add(new LinkedList<>());
        }
    }

    public boolean add(E key){
        int loc = Math.abs(key.hashCode()) % data.size();

        LinkedList<Node> list = data.get(loc);

        for(Node node : list){
            if (node.key.equals(key)){
                return false;
            }
        }

        list.add(new Node(key));

        size++;

        if (((double)size)/data.size() > limit){
            rehash();
        }

        return true;
    }

    private void rehash(){
        ArrayList<LinkedList<Node>> old = data;

        this.data = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            this.data.add(new LinkedList<>());
        }

        this.size = 0;

        for (LinkedList<Node> list : old) {
            for (Node node : list) {
                add(node.key);
            }
        }

    }


    public boolean contains(E key){
        int loc = Math.abs(key.hashCode()) % data.size();

        LinkedList<Node> list = data.get(loc);

        for(Node node : list){
            if (node.key.equals(key)){
                return true;
            }
        }

        return false;
    }

    public void remove(E key){
        int loc = Math.abs(key.hashCode()) % data.size();

        LinkedList<Node> list = data.get(loc);

        Node item = null;

        for(Node node : list){
            if (node.key.equals(key)){
                item = node;
                break;
            }
        }

        if (item != null){
            list.remove(item);
            size--;
        }

    }


    private class Node {
        private E key;

        public Node(E key) {
            this.key = key;
        }
    }
}
