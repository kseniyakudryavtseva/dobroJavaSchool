package lesson075;

import lesson075.filter.BookFilter;
import lesson075.filter.PriceFilter;
import lesson075.filter.ProductFilter;

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

    public Product[] getFiltered(ProductFilter filter) {
        return filter.filter(products);
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
        /*Basket basket = new Basket(3);
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
        System.out.println(basket.getCurrentSize());*/
        Basket basket = new Basket(10);
        Book book = new Book("Пушкин", "Евгений Онегин", 1825, 1000);
        Book book1 = new Book("Достоевский", "Преступление и наказание", 1870, 1500);
        Book book2 = new Book("Достоевский1", "Преступление и наказание", 1870, 2500);
        ChildrenBook childrenBook = new ChildrenBook("Чуковский", "Тараканище", 1925, 800);
        TV tv = new TV("Sumsung", 45, 50000);
        TV tv1 = new TV("Sumsung1", 45, 50000);
        Product[] product = new Product[]{book, book1, childrenBook};
        basket.addProduct(book);
        basket.addProduct(book1);
        System.out.println(basket.addProduct(book2));
        basket.addProduct(tv);
        basket.addProduct(childrenBook);
        System.out.println(basket);
        System.out.println(basket.totalSalePrice());
        System.out.println(basket.getCurrentSize());
        basket.printProducts();
        BookFilter bookFilter = new BookFilter();
        Product[] products1 = bookFilter.filter(new Product[]{book, tv, tv1, childrenBook, book1});
        System.out.println(Arrays.toString(products1));
        Product[] products2 = basket.getFiltered(bookFilter);
        System.out.println(Arrays.toString(products2));
        PriceFilter priceFilter = new PriceFilter(1000, 2500);
        Product[] products3 = basket.getFiltered(priceFilter);
        System.out.println(Arrays.toString(products3));
    }
}
