public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book("Java for impatient", "Cay Horstmann");
        printables[1] = new Magazine("Java Daily News");

        int i;
        for (i = 0; i < 3; i++)
            switch (i) {
                case 0:
                    Magazine.printMagazines(printables);
                    break;
                case 1:
                    Book.printBooks(printables);
                    break;
                default:
                    for (Printable printable : printables) {
                        printable.print();
                    }
            }
    }
}
