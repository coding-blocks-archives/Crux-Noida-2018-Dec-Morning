package com.codingblocks.lecture_18;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <K, V> {

    private ArrayList<LinkedList<Node>> data = new ArrayList<>();

    private int size = 0;

    private double limit = 5;

    public HashTable(){
        for (int i = 0; i < 10; i++) {
            data.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int loc = Math.abs(key.hashCode()) % data.size();

        LinkedList<Node> list = data.get(loc);

        for(Node node : list){
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));

        size++;

//        if (((double)size)/data.size() > limit){
//            rehash();
//        }
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
                put(node.key, node.value);
            }
        }

    }

    public V get(K key){
        int loc = Math.abs(key.hashCode()) % data.size();

        LinkedList<Node> list = data.get(loc);

        for(Node node : list){
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public boolean containsKey(K key){
        int loc = Math.abs(key.hashCode()) % data.size();

        LinkedList<Node> list = data.get(loc);

        for(Node node : list){
            if (node.key.equals(key)){
                return true;
            }
        }

        return false;
    }

    public void remove(K key){
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
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
