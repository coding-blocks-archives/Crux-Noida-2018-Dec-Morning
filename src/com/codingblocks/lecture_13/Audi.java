package com.codingblocks.lecture_13;

public class Audi implements Car {

    private Engine engine;
    private Steering steering;
    private Brake brake;

    public Audi() {
        this.engine = new PetrolEngine();
        this.steering = new PowerSteering();
        this.brake = new ABSBrake();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void steer(String direction) {

    }
}
