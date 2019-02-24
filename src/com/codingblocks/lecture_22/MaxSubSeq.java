package com.codingblocks.lecture_22;

import java.util.Map;

public class MaxSubSeq {

    public static int maxsub(String first, String second, int f_len, int s_len){

        if (f_len == 0 || s_len == 0){
            return 0;
        }

        int sol = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            sol =  1 + maxsub(first, second, f_len-1, s_len-1);
        } else {
            int case1 = maxsub(first, second, f_len-1, s_len);
            int case2 = maxsub(first, second, f_len, s_len-1);

            sol =  Math.max(case1, case2);
        }

        return sol;
    }

    public static int maxsubDP(String first, String second, int f_len, int s_len, Integer[][] memory){

        if (f_len == 0 || s_len == 0){
            return 0;
        }

        if (memory[f_len][s_len] != null){
            return memory[f_len][s_len];
        }

        int sol = 0;

        if (first.charAt(f_len-1) == second.charAt(s_len-1)){
            sol =  1 + maxsub(first, second, f_len-1, s_len-1);
        } else {
            int case1 = maxsub(first, second, f_len-1, s_len);
            int case2 = maxsub(first, second, f_len, s_len-1);

            sol =  Math.max(case1, case2);
        }

        memory[f_len][s_len] = sol;

        return sol;
    }

    public static int maxsubDPITR(String first, String second, int f_len, int s_len, Integer[][] memory){
        for (int f = 0; f <= f_len; f++) {
            for (int s = 0; s <= s_len ; s++) {
                if (f == 0 || s == 0){
                    memory[f][s] = 0;
                } else {
                    int sol = 0;

                    if (first.charAt(f-1) == second.charAt(s-1)){
                        sol =  1 + memory[f-1][s-1];
                    } else {
                        int case1 = memory[f-1][s];
                        int case2 = memory[f][s-1];
                        sol =  Math.max(case1, case2);
                    }

                    memory[f][s] = sol;
                }
            }
        }

        return memory[f_len][s_len];
    }


    }
