public class Studente extends Persona{
    private String matricola;

    public Studente(String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        System.out.println(getNome());
        return super.toString() + "Studente{" +
                "matricola='" + matricola + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona p = new Persona("marco", "rossi", "MMM");
        Persona s = p;
        System.out.println(p == s);
        p.setCognome("");
        Persona p2 = new Persona("marco", "rossi", "MMM", 2);
        Persona[] persone = new Persona[3];
        for (Persona persona : persone) {
            System.out.println(persona.toString());
        }
    }
}
