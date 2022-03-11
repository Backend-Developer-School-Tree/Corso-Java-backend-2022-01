package gestione_veicoli;

public class AutoMobile extends Veicolo {

    private int nporte;

    public AutoMobile(String targa, int nposti, int nporte) {
        super(targa, nposti);
        this.nporte = nporte;
    }

    public int getNporte() {
        return nporte;
    }

    @Override
    public String toString() {
        return getTarga() + ": " + getNporte();
    }
}


