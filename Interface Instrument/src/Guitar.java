public class Guitar implements Instrument {
    int NumberOfStrings;
    Guitar( int NumberOfStrings ) {
        this.NumberOfStrings = NumberOfStrings;
    }
    public void play() {
        System.out.println("Играет гитара c "+NumberOfStrings+" струнами");
    }
}
