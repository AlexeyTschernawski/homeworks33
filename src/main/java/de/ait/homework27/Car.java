package de.ait.homework27;

public class Car extends EnginePoweredVehicle implements Vehicle {

    private String model;

    public Car(String model, String engineType) {
        super(engineType);
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Машина запущена. Максимальная скорость " + MAX_SPEED);
    }

    @Override
    public void stop() {
        System.out.println("Машина остановлена");
    }

    @Override
    public String getColor(){
        return "red";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
