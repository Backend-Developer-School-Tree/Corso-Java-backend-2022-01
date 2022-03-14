import java.util.Objects;

public class Persona implements Comparable {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public int compareTo(Object o) {
        Persona persona = (Persona) o;

        if(this.getEta() > persona.getEta())
            return 1;

        if(this.getEta() < persona.getEta())
            return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Persona persona = (Persona) o;

        return eta == persona.eta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eta);
    }
}
