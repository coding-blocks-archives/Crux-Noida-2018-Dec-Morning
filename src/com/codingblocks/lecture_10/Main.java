package com.codingblocks.lecture_10;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

//        int[] vals = {1, 2, 6, 7, 4, 3};
//
//        int x = 9;
//
//        eval(vals, x);

        System.out.println(power(new BigInteger("654325"), 87654));

    }

    public static int eval(int[] vals, int x){
        int p = 1;

        int res = 0;

        for (int i = 0; i < vals.length; i++) {
            res += p*vals[i];

            p = p*x;
        }

        return res;
    }

    public static BigInteger power(BigInteger x, int n){

        if (n == 0){
            return BigInteger.ONE;
        }

        BigInteger sol = power(x, n/2);

        sol = sol.multiply(sol);

        if (n % 2 == 1){
            sol = sol.multiply(x);
        }

        return sol;
    }


}
