package lesson06;

public class Main {
    public static void main(String[] args) {
        Rose hollandRose = new Rose("Holland", 200);
        Rose japanRose = new Rose("Japan", 150);
        Tulip hollandTulip = new Tulip("Holland", 170);
        Tulip japanTulip = new Tulip("Japan", 100);
        Lily hollandLily = new Lily("Holland", 300);
        Lily japanLily = new Lily("Japan", 350);
        Flower[] bouquet1 = new Flower[]{hollandRose, japanRose, hollandLily};
        Flower[] bouquet2 = new Flower[]{hollandTulip, japanTulip};
        Flower[] bouquet3 = new Flower[]{japanLily};
        System.out.println("Цена за букет: " + BouquetUtils.priceOfBouquet(bouquet1));
        System.out.println("Цена за букет: " + BouquetUtils.priceOfBouquet(bouquet2));
        System.out.println("Цена за букет: " + BouquetUtils.priceOfBouquet(bouquet3));
        System.out.println("Всего продали цветов: " + Flower.counter);
    }
}
