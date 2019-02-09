package com.codingblocks.Lecture_17;

public class Human implements Comparable<Human>{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}
