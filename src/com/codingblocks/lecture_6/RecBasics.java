package com.codingblocks.lecture_6;

import java.math.BigInteger;

public class RecBasics {
    public static void main(String[] args) {
//        pi(5);

//        int result = pow(100, 8);
        BigInteger result = powBig(100, 800);
        System.out.println(result);

    }

    public static void pd(int n){

        if (n == 0) {
            return;
        }

        System.out.println(n);
        pd(n-1);
    }

    public static void pi(int n){

        if (n == 0) {
            return;
        }

        pi(n-1);
        System.out.println(n);
    }

    public static void pdi(int n){

        if (n == 0) {
            return;
        }

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

    public static int pow(int x, int n){
        if (n == 0){
            return 1;
        }

        return x * pow(x, n-1);
    }

    public static BigInteger powBig(int x, int n){
        if (n == 0) {
            return BigInteger.ONE;
        }

        BigInteger val = new BigInteger(Integer.toString(x));

        return val.multiply(powBig(x, n-1));
    }

    public static BigInteger fibo(int n){
        if (n < 2){
            return new BigInteger(Integer.toString(n));
        }

        return fibo(n-1).add(fibo(n-2));
    }


}
