package com.codingblocks.lecture_14;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        permutation("", "abc");

//        String line = "aabc";
//        int[] f = freq(line);
//
//        lexo("", f, line.length());

//        lexoNum(0, 5, 400);

//        triangleUp(7, 0);

//        duplicate("", "helllllllo");

//        System.out.println(isBalanced("", "[a + {b +\n" +
//                "(c + d) + e} + f", 0));

        int[] nums = {0, 1, 2, 3, 4};

        sets(nums, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
    }

    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permutation(first + ch + second, unprocessed);
        }
    }

    public static int[] freq(String line){
        int[] nums = new int[26];

        line = line.toLowerCase();

        for (int i = 0; i < line.length(); i++) {
            int pos = line.charAt(i) - 'a';

            nums[pos]++;
        }

        return nums;
    }

    public static void lexo(String processed, int[] unprocessed, int len){
        if (processed.length() == len){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length; i++) {
            if (unprocessed[i] > 0){
                char ch = (char)('a' + i);
                unprocessed[i]--;
                lexo(processed + ch, unprocessed, len);
                unprocessed[i]++;

            }
        }
    }

    public static void lexoNum(int processed, int min, int max){

        for (int i = 0; i < 10; i++) {
            if (processed == 0 && i == 0){
                continue;
            }

            int num = processed * 10 + i;

            if (num <= max){


                if (num > min) {
                    System.out.println(num);
                }

                lexoNum(num, min, max);
            }
        }
    }

    public static int pascal(int row, int col){
        if (row == -1){
            return 1;
        }

        if (row + 1 == col){

            pascal(row - 1, 0);
            System.out.println();
            return 1;
        }


        int val = pascal(row, col + 1);

        System.out.print(val + " ");

        return val * (col)/(row - col + 1);

    }

    public static void triangleUp(int row, int col){
        if (row == -1){
            return;
        }

        if (row + 1 == col){
            triangleUp(row - 1, 0);
            System.out.println();
            return;
        }

        triangleUp(row, col + 1);
        System.out.print("*");
    }

    public static void duplicate(String processed, String unprocessed){
        if (unprocessed.length() < 2){
            System.out.println(processed + unprocessed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (unprocessed.charAt(1) == ch){
            duplicate(processed, unprocessed.substring(1));
        } else {
            duplicate(processed + ch, unprocessed.substring(1));

        }


    }


    public static int twins(String unprocessed, int index){
        if (index + 2 >= unprocessed.length()){
            return 0;
        }

        int val = twins(unprocessed, index + 1);

        if (unprocessed.startsWith("aaa", index)){
            val++;
        }

        return val;
    }

    public static boolean automata(String line, int index){
        if (index == line.length()){
            return true;
        }

        if(line.charAt(0) != 'a'){
            return false;
        }

        if (line.startsWith("a", index)){
            if(!(line.startsWith("a", index + 1) || line.startsWith("bb", index+ 1) || index == line.length() - 1)){
                return false;
            } else {
                return automata(line, index + 1);
            }
        }

        if (line.startsWith("bb", index)){
            if(!(line.startsWith("a", index + 2) || index == line.length() - 2)){
                return false;
            } else {
                return automata(line, index + 2);
            }
        }

        return automata(line, index + 1);

    }

    public static boolean isBalanced(String processed, String line, int index){
        if (index == line.length()){

            if (processed.isEmpty()){
                return true;
            }

            return false;
        }

        char f = line.charAt(index);

        if (f == '(' || f == '{' || f == '['){
            return isBalanced(processed + f, line, index + 1);
        }

        if (f == ')' || f == '}' || f == ']'){
            if(processed.isEmpty()){
                return false;
            }

            char last  = processed.charAt(processed.length()-1);

            if (f == ')' && !(last == '(')){
                return false;
            }


            if (f == '}' && !(last == '{')){
                return false;
            }


            if (f == ']' && !(last == '[')){
                return false;
            }

            return isBalanced(processed.substring(0, processed.length()-1), line, index + 1);
        }

        return isBalanced(processed, line, index + 1);
    }

    public static void sets(int[] nums, int index, ArrayList<Integer> first, ArrayList<Integer> second, int f_sum, int s_sum){
        if (index == nums.length){
            if (f_sum == s_sum) {
                System.out.println(first + " - " + second);
            }

            return;
        }

        first.add(nums[index]);
        sets(nums, index + 1, first, second, f_sum + nums[index], s_sum);
        first.remove(first.size() - 1);

        second.add(nums[index]);
        sets(nums, index + 1, first, second, f_sum, s_sum + nums[index]);
        second.remove(second.size() - 1);

        sets(nums, index+1, first, second, f_sum, s_sum);

    }
}

