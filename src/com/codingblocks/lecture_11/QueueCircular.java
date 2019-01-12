package com.codingblocks.lecture_11;

public class QueueCircular {

    private int[] data;
    private int front;
    private int end;
    private int size;


    private static final int DEFAULT_SIZE = 10;

    public QueueCircular() {
        this.front = 0;
        this.size = 0;
        this.end = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public QueueCircular(int size) {
        this.front = 0;
        this.end = -1;
        this.data = new int[size];
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.data.length;
    }

    public void insert(int item){
        if(!this.isFull()){
            this.end = (this.end + 1) % this.data.length;
            this.data[this.end] = item;
            size ++;
        }
    }

    public int delete() throws Exception{
        if (!this.isEmpty()){
            int val = this.data[front];
            this.front = (this.front + 1) % this.data.length;
            size--;
            return val;
        }

        throw new Exception("Queue is empty");
    }

    public void display(){
        for (int i = front; i < front + size; i++) {
            System.out.print(data[i % data.length] + ", ");
        }

        System.out.println("End");
    }
}
