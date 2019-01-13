package com.codingblocks.lecture_11;

public class BlunderCar extends Car {

    public int engines = 2;

    public Engine engine;

    public BlunderCar(){
        engine = new PetrolEngine();
    }

    @Override
    public void start(){
        System.out.println("Start with extra noise");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Stoping like the wonder car");
        engine.stop();
    }

    @Override
    public void locking() {
        System.out.println("We are using blunder lock");
    }

    public void changeEngine(){
        engine = new PetrolEngine();
    }
}
