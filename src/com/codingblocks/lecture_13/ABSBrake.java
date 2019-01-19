package com.codingblocks.lecture_13;

public class ABSBrake implements Brake {

    @Override
    public void brake() {
        System.out.println("Braking with abs");
    }
}
