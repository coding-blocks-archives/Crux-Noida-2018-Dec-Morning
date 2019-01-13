package com.codingblocks.lecture_12;

import com.codingblocks.lecture_10.Stack;

public class DynamicStack extends Stack {


    @Override
    public void push(int item) {
        if (isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        super.push(item);
    }

}
