package lesson06.fruits;

public class Pear extends Fruit {
    public static double sum =0;
    public static double pearPrice = 125;

    public Pear(int weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return super.weight * pearPrice;
    }
}
