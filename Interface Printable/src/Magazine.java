class Magazine implements Printable{

    String name;

    Magazine(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }

    static void printMagazines(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Magazine)
                p.print();
        }
    }
}