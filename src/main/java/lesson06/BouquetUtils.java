package lesson06;

public class BouquetUtils {
    public static int priceOfBouquet(Flower[] bouquet) {
        int sum = 0;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null) {
                sum += bouquet[i].getPrice();
            }
        }
        return sum;
    }
}
