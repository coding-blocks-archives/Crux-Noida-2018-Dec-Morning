package com.codingblocks.lecture_11;

public abstract class Car {

    public int windows = 4;
    public int engines = 1;

    public void start(){
        System.out.println("Start like a normal car");
    }

    public void stop(){
        System.out.println("Stop like a normal car");
    }

    public abstract void locking();


}
