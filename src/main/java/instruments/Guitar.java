package instruments;

public class Guitar implements Instrument {
    int numberOfString;

    public Guitar(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, у гитары " + this.numberOfString + " струн");
    }
}
