package com.codingblocks.lecture_13;

import java.util.Stack;

public class QueueUsingStackInsert {

    private Stack<Integer> stack = new Stack<>();

    public void insert(int item){
        stack.push(item);
    }

    public int remove(){
       Stack<Integer> extra = new Stack<>();

       while (!stack.isEmpty()){
           extra.push(stack.pop());
       }

       int val = extra.pop();

       while (!extra.empty()){
           stack.push(extra.pop());
       }

       return val;

    }

    public boolean isEmpty(){
        return stack.empty();
    }

}
