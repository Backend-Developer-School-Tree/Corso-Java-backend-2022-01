package gestione_veicoli;

public class AutoCarro extends Veicolo {

    private int maxCapacity;

    public AutoCarro(String targa, int nposti, int maxCapacity) {
        super(targa, nposti);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }


    @Override
    public String toString() {
        return getTarga() + ": " + getMaxCapacity();
    }
}
