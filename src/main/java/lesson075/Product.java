package lesson075;

public abstract class Product {
    private final double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    abstract double getSalePrice();
}
