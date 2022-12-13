package instruments;

public class Trumpet implements Instrument {
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, у трубы диаметр " + this.diameter);
    }
}
