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
        System.out.println("Запущен электродвигатель. Тип "
                + super.getEngineType()
                + " Емкость батареи " + akkuValue);
    }

    @Override
    public void stop() {
        System.out.println("Остановлен элоктродвигатель. Тип "
                + super.getEngineType() +
                " Емкость батареи " + akkuValue);
    }

    @Override
    public void showEngineType(){
        System.out.println("Тип двигателя " + super.getEngineType()
                + " Емкость батареи " + akkuValue);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "akkuValue=" + akkuValue +
                "} " + super.toString();
    }
}
