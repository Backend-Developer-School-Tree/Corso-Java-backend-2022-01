public abstract class Frutto {

    private Colore colore;
    private boolean contieneSemi;

    public Frutto(Colore colore, boolean contieneSemi) {
        this.colore = colore;
        this.contieneSemi = contieneSemi;
    }

    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public boolean contieneSemi() {
        return contieneSemi;
    }

    public void setContieneSemi(boolean contieneSemi) {
        this.contieneSemi = contieneSemi;
    }
}