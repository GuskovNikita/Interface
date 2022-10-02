public class Tool {
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(22);
        instruments[2] = new Trumpet(11);

        for (Instrument instrument :instruments) {
            instrument.play();
        }
    }
}