package com.codingblocks.lecture_11;

public class Engine {

    public int cycles = 0;

    public void start(){
        if (cycles > 5){
            System.out.println("Can not start");
            return;
        }
        System.out.println("Start like normal engine");
        cycles++;
    }

    public void stop(){
        System.out.println("Stop like normal engine");
    }


}
