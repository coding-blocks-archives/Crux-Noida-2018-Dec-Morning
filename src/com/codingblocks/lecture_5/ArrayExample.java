package com.codingblocks.lecture_5;

public class ArrayExample {
    public static void main(String[] args) {
//        int[][] nums = new int[5][5];
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25}
        };



//        for (int i = 0; i < nums.length; i++) {
//
//            int[] row = nums[i];
//
//            for (int j = 0; j < row.length; j++) {
//                System.out.println(row[j]);
//            }
//        }

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = new int[i+1];
//        }


    }

    public static void hor_wave(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.println(nums[i][j]);
                }
            } else {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.println(nums[i][nums[i].length - j - 1]);
                }
            }
        }
    }
    
    public static void ver_wave(int[][] nums){
        for (int j = 0; j < nums[0].length; j++) {
            if (j%2 == 0){
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i][j]);
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[nums.length - i - 1][j]);
                }
            }
        }
    }
}
