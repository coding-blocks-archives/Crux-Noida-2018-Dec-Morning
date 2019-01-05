package com.codingblocks.lecture_9;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] nums = {24,5634, 675, 456, 5476, 57};

        quick(nums, 0, nums.length - 1);


        System.out.println(Arrays.toString(nums));
    }

    public static void quick(int[] nums, int start, int end){


        if (end - start < 1){
            return;
        }


        int piv = pivot(nums, start, end);

        quick(nums, start, piv - 1);
        quick(nums, piv + 1, end);
    }

    private static int pivot(int[] nums, int start, int end) {

        int piv = end;

        int j = start;

        for (int i = start; i < piv; i++) {
            if (nums[i] < nums[piv]){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;

                j++;
            }
        }

        int t = nums[j];
        nums[j] = nums[piv];
        nums[piv] = t;

        return j;
    }
}
