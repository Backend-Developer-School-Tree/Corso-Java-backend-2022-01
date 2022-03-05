import java.util.Objects;

public class Persona {
    private String nome, cognome, codiceFiscale;
    private int eta;

    //costruttore 1
    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    //costruttore 2 piu specifico
    public Persona(String nome, String cognome, String codiceFiscale, int eta) {
        this(nome, cognome, codiceFiscale);
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if(cognome.isEmpty())
            return;
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    //override (reimplementazione) del metodo tostring di Object
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", eta=" + eta +
                '}';
    }

    //ritorna true se o è uguale a this
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //se è lo stesso identico oggetto (solo un diverso riferimento)
        if (o == null || getClass() != o.getClass()) return false; //controlla la classe es distributore e persona
        //se arriva qui, è sicuro di poter fare il cast senza errori
        Persona persona = (Persona) o; //es int -> Integer
        //boolean b = o instanceof Professore;
        //controllo effettivo
        return Objects.equals(codiceFiscale, persona.codiceFiscale);
        //return codiceFiscale.equals(persona.codiceFiscale);
    }

    //deve tornare un intero che rappresenta l'oggetto
    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale);
        //return codiceFiscale.hashCode();
    }
}
