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

        if(this.getEta() > persona.getEta() && this.getNome().compareTo(persona.getNome()))
            return 1;

        if(this.getEta() < persona.getEta())
            return -1;

        return 0;
    }
}
