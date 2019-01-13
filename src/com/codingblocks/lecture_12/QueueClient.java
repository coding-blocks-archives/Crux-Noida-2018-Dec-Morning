package com.codingblocks.lecture_12;

import com.codingblocks.lecture_10.Stack;
import com.codingblocks.lecture_11.Queue;

public class QueueClient {

    public static void main(String[] args) {
        Queue queue = new DynamicQueue();

        for (int i = 0; i < 10000; i++) {
            queue.insert(i);
        }


        queue.display();
    }
}
