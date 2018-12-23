package com.codingblocks.lecture_3;

public class NumberSystem {
    public static void main(String[] args) {
        System.out.println(any2any(100100, 2, 8));
    }

    public static int deciToBin(int deci){
        int bin = 0;
        int place = 1;

        while (deci > 0){
            int r = deci % 2;
            deci = deci / 2;

            bin = bin + r * place;

            place = place * 10;

        }

        return bin;
    }

    public static int deciToany(int deci, int t_base){
        int any = 0;
        int place = 1;

        while (deci > 0){
            int r = deci % t_base;
            deci = deci / t_base;

            any = any + r * place;

            place = place * 10;

        }

        return any;
    }

    public static int bin2Deci(int bin){
        int deci = 0;
        int place = 1;

        while (bin > 0){
            int r = bin % 10;
            bin = bin / 10;

            deci = deci + r * place;

            place = place * 2;
        }

        return deci;
    }

    public static int any2Deci(int any, int s_base){
        int deci = 0;
        int place = 1;

        while (any > 0){
            int r = any % 10;
            any = any / 10;

            deci = deci + r * place;

            place = place * s_base;
        }

        return deci;
    }

    public static int any2any(int value, int s_base, int t_base){
        int decimal = any2Deci(value, s_base);

        return deciToany(decimal, t_base);
    }
}
