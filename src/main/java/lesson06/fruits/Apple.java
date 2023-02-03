package lesson06.fruits;

public class Apple extends Fruit {
    public static double sum = 0;
    public static double applePrice = 80;

    public Apple(int weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return weight * applePrice;
    }
}
