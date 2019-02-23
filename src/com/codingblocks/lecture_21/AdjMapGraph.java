package com.codingblocks.lecture_21;


import java.util.*;

public class AdjMapGraph <T> {

    private HashMap<T, Vertex> vertexHashMap = new HashMap<>();

    public void addVertex(T value){
        vertexHashMap.put(value, new Vertex(value));
    }

    public void addEdge(T first, T second){
        Vertex f_vertex = vertexHashMap.get(first);
        Vertex s_vertex = vertexHashMap.get(second);

        if (f_vertex != null && s_vertex != null){
            f_vertex.neighbours.put(second, s_vertex);
            s_vertex.neighbours.put(first, f_vertex);
        }
    }

    public void dft(T start){
        Vertex v_start = vertexHashMap.get(start);

        if (v_start == null){
            return;
        }

        HashSet<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        set.add(v_start);
        stack.push(v_start);

        while (!stack.empty()){
            Vertex top = stack.pop();
            System.out.println(top.value);

            for (Vertex padosi : top.neighbours.values()) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.push(padosi);
                }
            }

        }
    }

    public void connectedComponents(){

        HashSet<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();


        for (Vertex v_start : vertexHashMap.values()) {

            if (set.contains(v_start)){
                continue;
            }

            set.add(v_start);
            stack.push(v_start);

            while (!stack.empty()){
                Vertex top = stack.pop();
                System.out.print(top.value + " ");
                for (Vertex padosi : top.neighbours.values()) {
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.push(padosi);
                    }
                }

            }

            System.out.println();
        }

    }


    public void bft(T start){
        Vertex v_start = vertexHashMap.get(start);

        if (v_start == null){
            return;
        }

        HashSet<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        set.add(v_start);
        queue.add(v_start);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.println(top.value);

            for (Vertex padosi : top.neighbours.values()) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }

        }
    }



    public int bfs(T start, T end){
        Vertex v_start = vertexHashMap.get(start);
        Vertex v_end = vertexHashMap.get(end);

        if (v_start == null || v_end == null){
            return -1;
        }

        int level = 0;

        HashSet<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        set.add(v_start);
        queue.add(v_start);
        queue.add(null);

        while (queue.size() > 1){
            Vertex top = queue.remove();

            if (top == null){
                queue.add(null);
                level++;
                continue;
            }

            if (top.value.equals(end)){
                return level;
            }

            for (Vertex padosi : top.neighbours.values()) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }

        }

        return -1;
    }

    private class Vertex {
        private T value;
        private HashMap<T, Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
        }


    }

}
