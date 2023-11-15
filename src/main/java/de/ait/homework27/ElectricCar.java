package de.ait.homework27;

public class ElectricCar extends EnginePoweredVehicle{

    private int akkuValue;

    public ElectricCar(int akkuValue) {
        super("Electric engine");
        this.akkuValue = akkuValue;
    }

    public int getAkkuValue() {
        return akkuValue;
    }

    public void setAkkuValue(int akkuValue) {
        this.akkuValue = akkuValue;
    }

    @Override
    public void start() {
        System.out.println("The electric motor has started. Type "
                + super.getEngineType()
                + " Battery capacity " + akkuValue);
    }

    @Override
    public void stop() {
        System.out.println("The electric motor has stopped. Type "
                + super.getEngineType() +
                " Battery capacity " + akkuValue);
    }

    @Override
    public void showEngineType(){
        System.out.println("engine's type " + super.getEngineType()
                + " Battery capacity " + akkuValue);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "akkuValue=" + akkuValue +
                "} " + super.toString();
    }
}
