package com.codingblocks.lecture_10;


public class StackClient {
    public static void main(String[] args) throws Exception {

        Stack my_stack = new Stack();

        my_stack.push(10);
        my_stack.display();

        my_stack.push(20);
        my_stack.display();

        my_stack.push(30);
        my_stack.display();


//        try {
            my_stack.pop();

            my_stack.pop();

            my_stack.pop();

            my_stack.pop();




        my_stack.display();
    }
}
