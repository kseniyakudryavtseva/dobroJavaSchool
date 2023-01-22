package lesson075;

import java.util.Arrays;

public class Basket {
    private Product[] products;
    private int maxSize;
    private int currentSize = 0;


    public Basket(int size) {
        this.products = new Product[size];
        this.maxSize = size;
    }

    public boolean addProduct(Product product) {
        if (maxSize > currentSize) {
            products[currentSize] = product;
            currentSize++;
            return true;
        }
        return false;
    }

    public double totalSalePrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalPrice += products[i].getSalePrice();
            }
        }
        return totalPrice;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void printProducts() {
        if (getCurrentSize() == 0) {
            System.out.println("The basket is empty");
        } else {
            System.out.println("products=" + Arrays.toString(products));
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                ", maxSize=" + maxSize +
                ", currentSize=" + currentSize +
                '}';
    }

    public static void main(String[] args) {
        Basket basket = new Basket(3);
        Book book = new Book("Пушкин", "Евгений Онегин", 1825, 2000);
        Book book2 = new Book("Пушкин2", "Евгений Онегин", 1825, 2000);
        Book book3 = new Book("Пушкин3", "Евгений Онегин", 1825, 2000);
        ChildrenBook childrenBook = new ChildrenBook("Гоголь", "Мертвые души", 1855, 3000);
        basket.printProducts();
        basket.addProduct(book);
        basket.addProduct(childrenBook);
        basket.addProduct(book2);
        basket.addProduct(book3);
        System.out.println(basket);
        System.out.println(basket.totalSalePrice());
        System.out.println(basket.totalSalePrice());
        System.out.println(basket.getCurrentSize());
    }
}
