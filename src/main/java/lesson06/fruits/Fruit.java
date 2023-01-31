package lesson06.fruits;

public abstract class Fruit {
    public int weight;
    static int counter = 0;

    public Fruit(int weight){
        this.weight = weight;
        counter++;
    }
    public abstract int price();
}
