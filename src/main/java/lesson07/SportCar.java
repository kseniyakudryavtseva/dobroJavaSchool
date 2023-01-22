package lesson07;

import java.util.Objects;

public class SportCar extends Car {
    private final int topSpeed;

    public SportCar(String model, int weight, Driver driver, Engine engine, int topSpeed) {
        super(model, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "topSpeed=" + topSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return topSpeed == sportCar.topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), topSpeed);
    }
}
