package distributore_bevande;

public class ProdottoDistributore {
    private String codice;
    private double prezzo;

    public ProdottoDistributore(String codice, double prezzo) {
        this.codice = codice;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

}