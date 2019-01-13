package com.codingblocks.lecture_11;

public class QueueOptimised extends Queue {

    private int[] data;
    private int front;
    private int end;


    private static final int DEFAULT_SIZE = 10;

    public QueueOptimised() {
        this.front = 0;
        this.end = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public QueueOptimised(int size) {
        this.front = 0;
        this.end = -1;
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return this.end < this.front;
    }

    public boolean isFull(){
        return this.end == this.data.length - 1;
    }

    public void insert(int item){
        if(!this.isFull()){
            this.data[++this.end] = item;
        }
    }

    public int delete() throws Exception{
        if (!this.isEmpty()){
            return data[front++];
        }

        throw new Exception("Queue is empty");
    }

    public void display(){
        for (int i = front; i <= end; i++) {
            System.out.print(data[i] + ", ");
        }

        System.out.println("End");
    }
}
