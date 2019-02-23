package com.codingblocks.lecture_20;

import java.util.LinkedList;

public class AdjListGraph <T>{

    private LinkedList<Vertex> vertices;

    public AdjListGraph() {
        vertices = new LinkedList<>();
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T start, T end){
        Vertex s_v = find(start);
        Vertex e_v = find(end);
        if (s_v != null && e_v != null){
            s_v.neighbours.add(e_v);
            e_v.neighbours.add(s_v);
        }
    }

    private boolean exists(T value){
        for (Vertex v: vertices) {
            if (v.value.equals(value)){
                return true;
            }
        }

        return false;
    }

    private Vertex find(T value){
        for (Vertex v: vertices) {
            if (v.value.equals(value)){
                return v;
            }
        }

        return null;
    }


    private class Vertex {
        private T value;
        private LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }
}
