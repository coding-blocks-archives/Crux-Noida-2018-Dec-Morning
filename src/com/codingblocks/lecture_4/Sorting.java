package com.codingblocks.lecture_4;

public class Sorting {
    public static void main(String[] args) {
//        int[] nums = {45, 657, 436,647 ,68 ,56};
//
//        insertion(nums);
//
//        Main.display(nums);

        int[] nums = {3, 6, 1, 2, 5, 0, 4};

        int[] res = inverse(nums);

        Main.display(res);
    }

    public static void bubble(int[] nums){

        // total n-1 iterations
        for (int i = 0; i < nums.length - 1; i++) {

            // takes n - i - 1 steps inside
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    Main.swap(nums, j, j+1);
                }
            }

            // pushed max to end. now sort one less
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = Main.maxIndexInRange(nums, 0, nums.length - i - 1);
            Main.swap(nums, maxIndex, nums.length - i - 1);
        }
    }

    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j-1]){
                    Main.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static int[] inverse(int[] nums){

        int[] result = new int[nums.length];

        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];

            result[v] = p;
        }

        return result;
    }
}
