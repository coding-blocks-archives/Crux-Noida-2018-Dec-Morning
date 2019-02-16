package com.codingblocks.lecture_19;

public class Human implements Comparable<Human>{
    private String name;
    private int age;
    private int salary;

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Human second) {
        return this.name.compareTo(second.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
