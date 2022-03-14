import java.util.*;

public class Main {
    public static void main(String[] args) {
        InterfacciaIterabile oggettoIterabile = new ClasseIterabile();
        ClasseIterabile2 oggettoIterabile2 = new ClasseIterabile2();

        nextIterabile(oggettoIterabile);
        nextIterabile(oggettoIterabile2);

        compara(5, 2);
        compara('a', 'a');
        Persona mario = new Persona("Mario", 18);
        Persona luigi = new Persona("Luigi", 20);
        Persona pippo = new Persona("Pippo", 6);
        Persona paperino = new Persona("Paperino", 6);
        compara(mario, luigi);

        List<Persona> persone = new ArrayList<Persona>();
        persone.add(mario);
        persone.add(luigi);
        persone.add(pippo);
        persone.add(paperino);

        System.out.println("*****LISTA*****");
        //ITERIAMO LA LISTA CON UN CICLO FOR
        /*for(Integer i = 0; i < persone.size(); i++) {
            Persona persona = persone.get(i);
            System.out.println(persona);
        }*/

        //ITERIAMO LA LISTA CON UN ITERATORE
        /*Iterator<Persona> iteratore = persone.iterator();
        while(iteratore.hasNext()) {
            Persona persona = iteratore.next();
            System.out.println(persona);
        }*/

        //ITERIAMO LA LISTA CON UN CICLO FOREACH
        for (Persona persona: persone) {
            System.out.println(persona);
        }

        Set<Persona> setPersone = new TreeSet<Persona>();
        setPersone.add(luigi);
        setPersone.add(mario);
        setPersone.add(pippo);
        setPersone.add(paperino);

        System.out.println("*****SET*****");
        for (Persona persona: setPersone) {
            System.out.println(persona);
        }

        Map<String, Persona> mappaPersone = new TreeMap<String, Persona>();

        mappaPersone.put("1", luigi);
        mappaPersone.put("40", mario);
        mappaPersone.put("7", pippo);

        System.out.println("*****MAP*****");
        for (String key: mappaPersone.keySet()) {
            System.out.println(mappaPersone.get(key));
        }

        if(mappaPersone.containsValue(paperino))
            System.out.println("Paperino Presente");
        else
            System.out.println("Paperino NON Presente");
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
