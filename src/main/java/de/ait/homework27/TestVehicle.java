package de.ait.homework27;

public class TestVehicle {

    public static void main(String[] args) {
        Car car = new Car("Audi A8", "Petrol");
        car.start();
        car.stop();
        car.honk();
        System.out.println(car.getColor());
        System.out.println(" max speed " +
                Vehicle.MAX_SPEED);
        System.out.println("---------");

        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();
        bicycle.honk();
        System.out.println(bicycle.getColor());

        System.out.println(" Maximum bike speed "
                + bicycle.MAX_SPEED_BICYCLE);


        System.out.println("---------");
        Vehicle vehicleCar = new Car("BMW X6", "Diesel");
        vehicleCar.start();
        vehicleCar.stop();
        vehicleCar.honk();
        System.out.println(vehicleCar.getColor());

        System.out.println("---------");
        Vehicle vehicleBicycle = new Bicycle();
        vehicleBicycle.start();
        vehicleBicycle.stop();
        vehicleBicycle.honk();
        System.out.println(vehicleBicycle.getColor());

        ElectricCar electricCar = new ElectricCar(2500);
        electricCar.showEngineType();
        System.out.println("Battery capacity "
                + electricCar.getAkkuValue());
        electricCar.setAkkuValue(4000);
        System.out.println("New battery capacity "
                + electricCar.getAkkuValue());



        System.out.println("---------Array------");
        Vehicle[] vehicles = {car, bicycle, electricCar};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].start();
            vehicles[i].stop();
            vehicles[i].honk();
            vehicles[i].getColor();

            System.out.println("---------");
            System.out.println(electricCar.toString());
        }

    }
}
