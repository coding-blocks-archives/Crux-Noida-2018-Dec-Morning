package com.codingblocks.lecture_13;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start like petrol car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like petrol car");

    }

    @Override
    public void acc() {
        System.out.println("Acc like petrol car");
    }
}
