package com.codingblocks.lecture_13;

public interface Car {

    void start();
    void stop();
    void brake();
    void steer(String direction);

    void changeSteering(Steering steering);
    void changeEngine(Engine engine);
    void changBrake(Brake brake);


}
