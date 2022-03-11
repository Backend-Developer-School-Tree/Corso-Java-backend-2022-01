package gestione_veicoli;

public abstract class Veicolo {
    private String targa;
    private int nposti;

    public Veicolo(String targa, int nposti) {
        this.targa = targa;
        this.nposti = nposti;
    }

    public String getTarga() {
        return targa;
    }

}