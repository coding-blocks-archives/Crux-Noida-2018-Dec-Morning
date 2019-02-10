package com.codingblocks.lecture_18;


import java.util.LinkedList;

public class HTLinkedList <K, V> {

    private LinkedList<Node> list = new LinkedList<>();

    public void put(K key, V value){
        for(Node node : list){
            if (node.key.equals(key)){
                node.value = value;
            }
        }

        list.add(new Node(key, value));
    }

    public V get(K key){
        for(Node node : list){
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void remove(K key){

        Node item = null;

        for(Node node : list){
            if (node.key.equals(key)){
                item = node;
                break;
            }
        }

        list.remove(item);
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
