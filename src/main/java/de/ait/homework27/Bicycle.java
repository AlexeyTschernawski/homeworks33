package de.ait.homework27;

public class Bicycle implements Vehicle{

    public final int MAX_SPEED_BICYCLE = 50;

    @Override
    public void start() {
        System.out.println("The bike is running. Maximum speed "
                + MAX_SPEED_BICYCLE);
        System.out.println("Speed difference  "
                + (MAX_SPEED - MAX_SPEED_BICYCLE));
    }

    @Override
    public void stop() {
        System.out.println("The bike is stopped");
    }

    @Override
    public String getColor(){
        return "white";
    }

    @Override
    public void honk(){
        System.out.println("din don");
    }
}
