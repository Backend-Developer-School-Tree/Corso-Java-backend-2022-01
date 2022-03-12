public class Main {
    public static void main(String[] args) {
        InterfacciaIterabile oggettoIterabile = new ClasseIterabile();
        ClasseIterabile2 oggettoIterabile2 = new ClasseIterabile2();

        nextIterabile(oggettoIterabile);
        nextIterabile(oggettoIterabile2);

        compara(5, 2);
        compara('a', 'a');
        compara(new Persona("Mario", 18), new Persona("Luigi", 20));
    }

    public static void nextIterabile(InterfacciaIterabile oggetto) {
        oggetto.next();
    }

    public static void compara(Comparable comparable1, Comparable comparable2) {
        int risultatoComparazione = comparable1.compareTo(comparable2);

        if(risultatoComparazione > 0)
            System.out.println("Pippo");
        else if(risultatoComparazione < 0)
            System.out.println("Pluto");
        else
            System.out.println("Paperino");
    }
}
