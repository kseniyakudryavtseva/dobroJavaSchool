package lesson06.fruits;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(3);
        Apple apple1 = new Apple(4);
        Pear pear = new Pear(5);
        Pear pear1 = new Pear(6);
        Fruit[] fruits = new Fruit[]{apple, apple1, pear, pear1};
        Apple[] apples = new Apple[]{apple, apple1};
        Pear[] pears = new Pear[]{pear, pear1};
        System.out.println("Общая стоимость фруктов: " + totalPrice(fruits));
        System.out.println("Стоимость яблок: " + totalApplePrice(apples));
        System.out.println("Стоимость груш: " + totalPearPrice(pears));
    }

    private static double totalPrice(Fruit[] fruits) {
        double sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            sum += fruits[i].getPrice();
        }
        return sum;
    }

    public static double totalApplePrice(Apple[] apples) {
        double sum = 0;
        for (int i = 0; i < apples.length; i++) {
            sum += apples[i].getPrice();
        }
        return sum;
    }

    public static double totalPearPrice(Pear[] pears) {
        double sum = 0;
        for (int i = 0; i < pears.length; i++) {
            sum += pears[i].getPrice();
        }
        return sum;
    }

}
