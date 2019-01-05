package com.codingblocks.lecture_9;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] nums = {45, 57,37, 68, 56};

        nums = mergesort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] mergesort(int[] nums){

        if (nums.length <= 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] first = Arrays.copyOfRange(nums, 0, mid);
        int[] second = Arrays.copyOfRange(nums, mid, nums.length);

        first = mergesort(first);
        second = mergesort(second);

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] result = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }

        while (i < first.length){
            result[k++] = first[i++];
        }

        while (j < second.length){
            result[k++] = second[j++];
        }

        return result;
    }
}
