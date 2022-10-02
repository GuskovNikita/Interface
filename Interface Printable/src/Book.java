class Book implements Printable{

    String name;
    String author;

    Book(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }

    static void printBooks(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Book)
                p.print();
        }
    }
}