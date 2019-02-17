package com.codingblocks.lecture_20;


import java.util.LinkedList;

public class EdgeListGraph <T> {

    private LinkedList<Vertex> vertices;
    private LinkedList<Edge> edges;

    public EdgeListGraph() {
        vertices = new LinkedList<>();
        edges = new LinkedList<>();
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T start, T end){
        if (exists(start) && exists(end)) {
            edges.add(new Edge(start, end));
        }
    }

    public LinkedList<Edge> startFrom(T value){
        LinkedList<Edge> list = new LinkedList<>();

        for (Edge e : edges) {
            if (e.start.equals(value)){
                list.add(e);
            }
        }

        return list;
    }

    private boolean exists(T value){
        for (Vertex v: vertices) {
            if (v.value.equals(value)){
                return true;
            }
        }

        return false;
    }

    private class Vertex {
        private T value;

        public Vertex(T value) {
            this.value = value;
        }
    }

    private class Edge {
        private T start;
        private T end;

        public Edge(T start, T end) {
            this.start = start;
            this.end = end;
        }
    }
}
