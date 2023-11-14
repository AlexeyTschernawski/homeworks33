package de.ait.homework20;

import java.util.ArrayList;

public class TestCar {


    public static void main(String[] args) {

        Engine engineBmw = new Engine("1.2TSI", 185);
        Car bmw = new Car("BMW", "X5", engineBmw);


        Engine engine1 = new Engine("176de", 45);
        Car car1 = new Car("Opel", "Corsa", engine1);


        Engine engine2 = new Engine("V12", 500);
        Car car2 = new Car("Mercedes", "E-Klass", engine2);

        System.out.println("Car make: " + car1.getMake() + "\ntype: " + car1.getModel() + "\nengine's type: "
                + car1.getEngine().getType() + "\nМощность двигателя: " + car1.getEngine().getPower());
        System.out.println("---");
        System.out.println("Car make: " + car2.getMake() + "\ntype: " + car2.getModel() + "\nengine's type: "
                + car2.getEngine().getType() + "\nEngine power: " + car2.getEngine().getPower());


        System.out.println("---");
        System.out.println("Car make: " + car2.getMake() + "\nmodel: " + car2.getModel() + "\nengine's type: "
                + car2.getEngine().getType() + "\nEngine power: " + car2.getEngine().getPower());


        ArrayList<Car> garage = new ArrayList<>();
        garage.add(car1);
        garage.add(car2);

        System.out.println(car1);
        System.out.println(car2);




    }
}
