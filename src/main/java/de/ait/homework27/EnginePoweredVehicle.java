package de.ait.homework27;

public class EnginePoweredVehicle implements Vehicle {

    //тип двигателя
    private String engineType;

    public EnginePoweredVehicle(String engineType) {
        this.engineType = engineType;
    }

    public void showEngineType(){
        System.out.println("Тип двигателя " + engineType);
    }


    @Override
    public void start() {
        System.out.println("Запущен двигатель. Тип " + engineType);
    }

    @Override
    public void stop() {
        System.out.println("Остановлен двигатель. Тип " + engineType);
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "EnginePoweredVehicle{" +
                "engineType:'" + engineType + '\'' +
                '}';
    }
}
