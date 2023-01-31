package lesson06.fruits;

public class Main {
    public static void main(String[] args){
        Apple apple = new Apple(3);
        Apple apple1 = new Apple(4);
        Pear pear = new Pear(5);

       // System.out.println("Общая стоимость фруктов: " + Fruit.totalPrice);
        System.out.println("Стоимость яблок: " + apple.totalApplePrice());
        //System.out.println("Стоимость груш: " + Pear.totalPearPrice)

    }
}
