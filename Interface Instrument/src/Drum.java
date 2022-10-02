public class Drum implements Instrument {
    int Size ;
    Drum( int Size ) {
        this.Size = Size;
    }
    public void play() {
        System.out.println("Играет барабан с размером "+ Size);
    }
}
