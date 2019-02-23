package com.codingblocks.lecture_21;

public class Main {
    public static void main(String[] args) {
        AdjMapGraph<Integer> graph = new AdjMapGraph<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(1, 2);
        graph.addEdge(3, 2);

        graph.addEdge(4, 5);
        graph.addEdge(6, 5);

        graph.connectedComponents();


    }
}
