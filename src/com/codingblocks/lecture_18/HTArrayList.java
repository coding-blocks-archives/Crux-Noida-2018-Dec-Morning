package com.codingblocks.lecture_18;

import java.util.ArrayList;

public class HTArrayList <K, V> {

    private ArrayList<Node> list = new ArrayList<>();

    public HTArrayList(){
        for (int i = 0; i < 10; i++) {
            list.add(null);
        }
    }

    public void put(K key, V value){
        int loc = Math.abs(key.hashCode()) % list.size();

        list.set(loc, new Node(key, value));
    }

    public V get(K key){
        int loc = Math.abs(key.hashCode()) % list.size();

        if (list.get(loc) != null && list.get(loc).key.equals(key)){
            return list.get(loc).value;
        }

        return null;
    }

    public void remove(K key){
        int loc = Math.abs(key.hashCode()) % list.size();

        if (list.get(loc) != null && list.get(loc).key.equals(key)){
            list.set(loc, null);
        }

    }

    private class Node{
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
