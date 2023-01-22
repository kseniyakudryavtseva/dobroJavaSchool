package lesson07;

import java.util.Objects;

public class Lorry extends Car{
    private final int loadCapacity;

    public Lorry(String model, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(model, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return loadCapacity == lorry.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}
