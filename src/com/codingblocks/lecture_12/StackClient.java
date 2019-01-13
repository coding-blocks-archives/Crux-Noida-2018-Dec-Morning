package com.codingblocks.lecture_12;

import com.codingblocks.lecture_10.Stack;

public class StackClient {

    public static void main(String[] args) {
        Stack stack = new DynamicStack();

        for (int i = 0; i < 100000000; i++) {
            stack.push(i);
        }


        stack.display();
    }
}
