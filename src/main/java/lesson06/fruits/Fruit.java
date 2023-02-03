package lesson06.fruits;

public abstract class Fruit {
    public double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public abstract double getPrice();
}
