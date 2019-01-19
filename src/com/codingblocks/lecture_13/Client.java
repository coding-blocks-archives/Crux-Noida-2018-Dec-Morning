package com.codingblocks.lecture_13;

import java.lang.System.*;

public class Client {

    public static void main(String[] args) {


//        ArrayList<Brake> brakes = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            Brake b = new Brake() {
//                @Override
//                public void brake() {
//                    System.out.println("Like abs brake");
//                }
//            };
//
//            brakes.add(b);
//        }
//
//
//        Car my_car = new Audi(new PetrolEngine(), brakes.get(0));
//
//        my_car.start();
//        my_car.steer("left");
//        my_car.steer("right");
//        my_car.steer("left");
//        my_car.brake();
//        my_car.stop();
//
//        NormalSteering steering = new NormalSteering();
//
//        my_car.changeSteering(steering);
//
//        my_car.start();
//        my_car.steer("left");
//        my_car.steer("right");
//        my_car.steer("left");
//        my_car.brake();
//        my_car.stop();
//

    Student  ritvik = new TA();

    Teacher teacher = (Teacher)ritvik;


    ritvik.play();
    ritvik.study();


//    ritvik.job();



    }
}
