package com.codingblocks.lecture_10;

public class Human {

    public static int id_generator = 0;

    public int[] nums = new int[100000];

    public final int id;

    public int eyes;

    public String name;

    public int balance = 1000;

    public static int population = 0;

    public Human(){
        this.id = Human.id_generator++;
        Human.population = Human.population + 1;
        System.out.println("One is born " + population);
    }

    public Human(int eyes){
        this.id = Human.id_generator++;

        this.eyes = 2;
    }

    public Human(Human other){
        this.id = Human.id_generator++;
        this.name = other.name;
        this.balance = other.balance;
    }

    public void smile(){
        System.out.println("See I got such a great smile");
    }

    public void eat(){

//        int balance =  99999;

        this.balance = this.balance - 100;
    }

    public static void genesis(){
        Human.population = 0;

    }

    protected void finalize() throws Throwable {
        population--;

        System.out.println("One is dead " + population);

    }
}
