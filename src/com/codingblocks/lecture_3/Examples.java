package com.codingblocks.lecture_3;

import javax.xml.crypto.Data;
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Examples {

    public static void main(String[] args) throws Exception{

        File f = new File("happy.txt");

        Scanner s = new Scanner(f);
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());


//        long start = new Date().getTime();
//
//        System.out.println(inverse(12345678));
//
//        long end = new Date().getTime();
//
//        System.out.println(end - start);
    }

//    public static int count5(int num){
//
//    }
//
//    public static int countDigit(int num, int digit){
//
//    }

    public static int inverse(int num){
        int result = 0;
        int p = 1;

        while ( num > 0 ){
            int v = num % 10;
            num = num / 10;

            result = result + (int)Math.pow(10, v - 1) * p;

            p++;
        }

        return result;
    }
}
