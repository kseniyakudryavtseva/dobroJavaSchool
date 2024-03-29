package lesson07;

import java.util.Objects;

public class Person {
    private final String fio;
    private final int age;

    public Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
}
