package com.codingblocks.lecture_6;

import java.util.Arrays;

public class RecArrayExamples {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 5};

//        System.out.println(isSorted(nums, nums.length - 1));

//        int[] result = findAllIndex(nums, 0, 3, 0);
//
//        System.out.println(Arrays.toString(result));

        bubble(nums, nums.length - 1, 0);

        System.out.println(Arrays.toString(nums));
    }

    public static boolean isSorted(int[] nums, int index){

        if (index == 0){
            return true;
        }

//        boolean present = nums[index] >= nums[index - 1];
//
//        if (!present){
//            return false;
//        }
//
//        boolean sub = isSorted(nums, index - 1);

        return nums[index] >= nums[index - 1] && isSorted(nums, index - 1) ;

    }

    public static boolean find(int[] nums, int index, int target){
        if (index == nums.length){
            return false;
        }

//        if (nums[index] == target){
//            return true;
//        }
//
//        return find(nums, index + 1, target);

        return nums[index] == target || find(nums, index + 1, target);
    }

    public static int findIndex(int[] nums, int index, int target){
        if (index == nums.length){
            return -1;
        }

        if (nums[index] == target){
            return index;
        }

        return findIndex(nums, index + 1, target);
    }

    public static int[] findAllIndex(int[] nums, int index, int target, int count){
        if (index == nums.length){
            return new int[count];
        }

        if (nums[index] == target){

            int[] result = findAllIndex(nums, index + 1, target, count+1);
            result[count] = index;

            return result;
        }

        return findAllIndex(nums, index + 1, target, count);
    }


    public static void triangleDown(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            System.out.println();
            triangleDown(row - 1, 0);
            return;
        }

        System.out.print("*");
        triangleDown(row, col + 1);
    }

    public static void triangleUp(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            triangleUp(row - 1, 0);
            System.out.println();
            return;
        }

        triangleUp(row, col + 1);
        System.out.print("*");
    }

    public static void bubble(int[] nums, int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            bubble(nums, row - 1, 0);
            return;
        }

        if (nums[col] > nums[col + 1]){
            int temp = nums[col];
            nums[col] = nums[col+1];
            nums[col+1] = temp;
        }

        bubble(nums, row, col + 1);
    }

}
