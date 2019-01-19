package com.codingblocks.lecture_13;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        stack = reverse(stack);

        System.out.println(stack);

    }

    public static Stack<Integer> reverse(Stack<Integer> stack){
        Stack<Integer> extra = new Stack<>();

        while (!stack.empty()){
            extra.push(stack.pop());
        }

        return extra;

    }


}
