package instruments;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(7);
        Drum drum = new Drum(25);
        Trumpet trumpet = new Trumpet(10);
        Instrument[] instrument = {guitar, drum, trumpet};
        playInstruments(instrument);
    }

    public static void playInstruments(Instrument[] instruments) {
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}
