package negozio;

public class Prodotto {
    private String codiceProdotto, nome;
    private double prezzo;
    private GenereProdotto genereProdotto;
    private int quantita;

    public Prodotto(String codiceProdotto, String nome, double prezzo,
                    GenereProdotto genereProdotto, int quantita) {
        this.codiceProdotto = codiceProdotto;
        this.nome = nome;
        this.prezzo = prezzo;
        this.genereProdotto = genereProdotto;
        this.quantita = quantita;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public GenereProdotto getGenereProdotto() {
        return genereProdotto;
    }

    public void setGenereProdotto(GenereProdotto genereProdotto) {
        this.genereProdotto = genereProdotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
