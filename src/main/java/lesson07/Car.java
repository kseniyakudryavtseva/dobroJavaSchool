package lesson07;

import java.util.Objects;

public class Car {
    private final String model;
    private final int weight;
    private final Driver driver;
    private final Engine engine;

    public Car(String model, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is starting");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car is stopping");
    }
    public void turnLeft(){
        System.out.println("Going to the left");
    }

    public void turnRight(){
        System.out.println("Going to the right");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && model.equals(car.model) && driver.equals(car.driver) && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight, driver, engine);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
