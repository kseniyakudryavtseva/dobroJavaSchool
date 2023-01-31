package lesson075.filter;

import lesson075.Product;

public interface ProductFilter {
    Product[] filter(Product[] products);
}
