package com.codingblocks.lecture_13;

public class TA implements Student, Teacher {

    @Override
    public void study() {
        System.out.println("Study like TA");
    }

    @Override
    public void job() {
        System.out.println("Job like TA");
    }

    @Override
    public void play() {
        System.out.println("Play like TA");
    }
}
