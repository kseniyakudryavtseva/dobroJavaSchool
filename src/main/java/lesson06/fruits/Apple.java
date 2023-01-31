package lesson06.fruits;

public class Apple extends Fruit{

    static int counter = 0;
    public Apple(int weight){
        super(weight);
        counter++;
    }

    public double totalApplePrice(){
        return this.price()*counter;
    }
    @Override
    public int price() {
        return super.weight*80;
    }
}
