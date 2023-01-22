package lesson06;

public class Flower {
    private final String country;
    private final int price;
    static int counter = 0;

    public Flower(String country, int price) {
        counter++;
        this.country = country;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
