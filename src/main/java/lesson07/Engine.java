package lesson07;

import java.util.Objects;

public class Engine {
    private final int enginePower;
    private final String manufacturer;

    public Engine(int enginePower, String manufacturer) {
        this.enginePower = enginePower;
        this.manufacturer = manufacturer;
    }

    public void start() {

        System.out.println("Engine is starting");
    }

    public void stop() {
        System.out.println("Engine is stopping");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return enginePower == engine.enginePower && Objects.equals(manufacturer, engine.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enginePower, manufacturer);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
