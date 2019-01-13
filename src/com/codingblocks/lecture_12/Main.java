package com.codingblocks.lecture_12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c = new Audi();

        c.start();

        System.out.println(c.windows);

        Audi a = new Audi();

        a.start();


    }

    public static void main(int b) {

        Car c = new Audi();

        c.start();

        System.out.println(c.windows);

        Audi a = new Audi();

        a.start();


    }



    public static int add(String name, int... nums){

        Arrays.sort(nums);

        return 0;
    }
}
