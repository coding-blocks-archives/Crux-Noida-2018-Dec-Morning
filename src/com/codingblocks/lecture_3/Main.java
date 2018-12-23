package com.codingblocks.lecture_3;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        int[] nums = new int[10];

        int[] nums = {342, 567, 67, 35, 68, 456, 57};

        Arrays.sort(nums);

        display(nums);

        System.out.println(binaryJustGreater(nums, 0));

//        System.out.println(nums);
//
//        nums[6] = 76;
//
//        display(nums);
//
//        swap(nums, 1, 2);
//
//        display(nums);


    }

    public static void swap(int[] nums, int first, int second){

        System.out.println(nums.toString());

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void display(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

            if (i < nums.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int linear(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static int binary(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


    public static int binaryJustGreater(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            } else {
                if (mid + 1 < nums.length && nums[mid+1] > target){
                    return mid+1;
                }
                start = mid + 1;
            }
        }

        return -1;
    }


}
