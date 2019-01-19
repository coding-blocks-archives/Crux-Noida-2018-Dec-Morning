package com.codingblocks.lecture_13;

public class NormalSteering implements Steering {
    @Override
    public void steer(String direction) {
        System.out.println("Steering rough with old steering to " + direction);
    }
}
