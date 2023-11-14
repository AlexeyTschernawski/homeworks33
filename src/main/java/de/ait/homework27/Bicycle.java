package de.ait.homework27;

public class Bicycle implements Vehicle{

    public final int MAX_SPEED_BICYCLE = 50;

    @Override
    public void start() {
        System.out.println("Велосипед запущен. Максимальная скорость "
                + MAX_SPEED_BICYCLE);
        System.out.println("Разница скоростей  "
                + (MAX_SPEED - MAX_SPEED_BICYCLE));
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановлен");
    }

    @Override
    public String getColor(){
        return "white";
    }

    @Override
    public void honk(){
        System.out.println("Дзинь дзинь");
    }
}
