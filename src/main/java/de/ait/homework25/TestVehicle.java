package de.ait.homework25;

public class TestVehicle {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 5);
        Boat boat = new Boat("Sailboat", 10);

        car.drive();
        car.fuelUp();
        car.stop();

        car.setFuelLevel(150);

        System.out.println();

        boat.drive();
        boat.fuelUp();
        boat.stop();

        boat.setName("Sea horse");

        Vehicle vehicle = new Car("Toyota", "Camry", 55);
        vehicle.fuelUp();

        vehicle = new Boat("Sailboat", 10);
        vehicle.fuelUp();


    }
}
