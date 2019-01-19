package com.codingblocks.lecture_13;

import java.util.Stack;

public class QueueUsingStackDelete {

    private Stack<Integer> stack = new Stack<>();

    public void insert(int item){
        Stack<Integer> extra = new Stack<>();

        while (!stack.isEmpty()){
            extra.push(stack.pop());
        }

        stack.push(item);

        while (!extra.empty()){
            stack.push(extra.pop());
        }

    }

    public int remove(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.empty();
    }

}
