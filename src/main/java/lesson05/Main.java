package lesson05;

public class Main {
    public static void main(String[] args){
        Money money = new Money(10,80);
        Money money1 = new Money(10,90);
        System.out.println(money.plus(money1));
        System.out.println(money.minus(money1));
        System.out.println(money.multiply(7));
        money.print();
    }
}
