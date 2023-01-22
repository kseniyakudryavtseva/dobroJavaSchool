package lesson07;

import java.util.Objects;

public class Driver extends Person {

    private final int drivingExperience;

    public Driver(String fio, int age, int drivingExperience) {
        super(fio, age);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingExperience == driver.drivingExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivingExperience);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
