package com.codingblocks.lecture_21;


import java.util.*;

public class AdjMapGraphWeighted<T> {

    private HashMap<T, Vertex> vertexHashMap = new HashMap<>();

    public void addVertex(T value){
        vertexHashMap.put(value, new Vertex(value));
    }

    public void addEdge(T first, T second, int weight){
        Vertex f_vertex = vertexHashMap.get(first);
        Vertex s_vertex = vertexHashMap.get(second);

        if (f_vertex != null && s_vertex != null){
            f_vertex.addNeighbour(s_vertex, weight);
            s_vertex.addNeighbour(f_vertex, weight);
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

    private Map<Vertex, Vertex> generateParents(){
        HashMap<Vertex, Vertex> parents = new HashMap<>();

        for (Vertex vertex : vertexHashMap.values()) {
            parents.put(vertex, null);
        }

        return parents;
    }

    private boolean union(Vertex first, Vertex second, Map<Vertex, Vertex> parents){
        Vertex p_first = find(first, parents);
        Vertex p_second= find(second, parents);

        if (p_first == p_second){
            return false;
        }

        parents.put(p_first, p_second);
        return true;
    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parents){
        while (parents.get(vertex) != null){
            vertex = parents.get(vertex);
        }

        return vertex;
    }

    private class Vertex {
        private T value;
        private HashMap<T, Vertex> neighbours;
        private HashMap<T, Integer> weights;

        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
        }

        public void addNeighbour(Vertex padosi, int weight){
            neighbours.put(padosi.value, padosi);
            weights.put(padosi.value, weight);
        }

    }

    private class Edge{
        private Vertex first;
        private Vertex second;
        private int weight;

        public Edge(Vertex first, Vertex second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }
    }

}
