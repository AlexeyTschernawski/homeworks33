package de.ait.homework20;

public class Car {
    /*
      Create a Car class with private fields make (make),
      model (model) and engine (engine).
      The engine must be a separate class Engine
      with fields type (type) and power (power),
      as well as setters and getters.
      In the Car class add methods
      for installation and receipt of the engine
     */

    private String make;

    private String model;

    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
