public class Trumpet implements Instrument {
    int Diameter;
    Trumpet( int Diameter ) {
        this.Diameter= Diameter;
    }
    public void play() {
        System.out.println("Играет труба с диаметром "+ Diameter);
    }
}
