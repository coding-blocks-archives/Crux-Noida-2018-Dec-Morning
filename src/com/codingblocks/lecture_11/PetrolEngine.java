package com.codingblocks.lecture_11;

public class PetrolEngine extends Engine {

    public void start(){
        if (cycles > 7){
            System.out.println("Can not start");
            return;
        }
        System.out.println("Start like Petrol engine");
        cycles++;
    }

    public void stop(){
        System.out.println("Stop like Petrol engine");
    }


}
