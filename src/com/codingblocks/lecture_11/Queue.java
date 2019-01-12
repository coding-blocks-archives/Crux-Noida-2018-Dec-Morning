package com.codingblocks.lecture_11;

public class Queue {

    private int[] data;
    private int end;

    private static final int DEFAULT_SIZE = 10;

    public Queue() {
        this.end = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public Queue(int size) {
        this.end = -1;
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return this.end == -1;
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
            int temp = data[0];
            for (int i = 0; i < end; i++) {
                data[i] = data[i+1];
            }

            end--;

            return temp;
        }

        throw new Exception("Queue is empty");
    }

    public void display(){
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + ", ");
        }

        System.out.println("End");
    }
}
