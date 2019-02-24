package com.codingblocks.lecture_22;

import java.util.Arrays;

public class DPIntro {
    public static void main(String[] args) {

        int n = 60;
        Integer[] memory = new Integer[n+1];

        System.out.println(Arrays.toString(memory));

        System.out.println(fibo(60, memory));
    }



    public static int fibo(int n){
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }



    public static int fiboItrative(int n, Integer[] memory){
        for (int i = 0; i <= n; i++) {
            if (i < 2){
                memory[i] = i;
            } else {
                memory[i] = memory[i-1] + memory[i-2];
            }
        }

        return memory[n];
    }

    public static int fibo(int n, Integer[] memory){
        if (n < 2){
            return n;
        }

        if (memory[n] != null){
            return memory[n];
        }

        memory[n] = fibo(n-1, memory) + fibo(n-2, memory);

        return memory[n];
    }
}
