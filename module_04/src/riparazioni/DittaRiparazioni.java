package riparazioni;

import java.util.Arrays;

public class DittaRiparazioni {

    private Tecnico[] tecnici;
    private int numTecnici;

    private Riparazione[] riparazioni;
    private int numRiparazioni;


    public DittaRiparazioni(Riparazione[] riparazioni, Tecnico[] tecnici){
        this.tecnici = tecnici;
        this.riparazioni = riparazioni;
        numTecnici = 0;
        for(Tecnico t : tecnici)
            if(t != null)
                numTecnici++;
        numRiparazioni = 0;
        for(Riparazione r : riparazioni)
            if(r != null)
                numRiparazioni++;
    }

    public Tecnico[] getTecnici(){
        return tecnici;
    }

    public boolean aggiungiRiparazione(Riparazione r){
        if (esisteRiparazioneDatoIndirizzo(r.getIndirizzo()))
            return false;
        if(numRiparazioni == riparazioni.length)
            return false;
        riparazioni[numRiparazioni] = r;
        numRiparazioni++;
        return true;
    }


    private boolean esisteRiparazioneDatoIndirizzo(String indirizzo){
        for (int i = 0; i < numRiparazioni; i++) {
            if (riparazioni[i].getIndirizzo().equals(indirizzo))
                return true;
        }

        return false;
    }


    public boolean aggiungiTecnico(Tecnico t){
        if (esisteTecnicoDatoNome(t.getNome()))
            return false;

        if (numTecnici == tecnici.length)
            return false;

        tecnici[numTecnici] = t;
        numTecnici++;
        return true;
    }


    private boolean esisteTecnicoDatoNome(String nome){
        for (int i = 0; i < numTecnici; i++) {
            if (tecnici[i] == null)
                break;

            if (tecnici[i].getNome().equals(nome))
                return true;
        }

        return false;
    }



    public Riparazione[] riparazioniInAttesa(){
        Riparazione[] inAttesa = new Riparazione[riparazioni.length];
        int countInAttesa = 0;

        for (int i = 0; i < numRiparazioni; i++) {
            if (riparazioni[i].getStato().equals(StatoRiparazione.inAttesa))
            {
                inAttesa[countInAttesa] = riparazioni[i];
                countInAttesa++;
            }
        }

        return inAttesa;
    }

    public Riparazione[] getRiparazioni() {
        return riparazioni;
    }

    public Riparazione getRiparazioneMaxPriorita(){
        Riparazione risultato = null;

        for (int i = 0; i < numRiparazioni; i++) {

            if (riparazioni[i].getStato().equals(StatoRiparazione.inAttesa))
            {
                if (risultato == null)
                    risultato = riparazioni[i];
                else if (riparazioni[i].getPriorita() > risultato.getPriorita())
                    risultato = riparazioni[i];
            }
        }

        return risultato;
    }



    public boolean assegnaProssimaRiparazione(){
        Tecnico tecnicoLibero = null;
        for (int i = 0; i < numTecnici; i++) {
            if (tecnici[i].getStato().equals(StatoTecnico.DISPONIBILE))
            {
                tecnicoLibero = tecnici[i];
                break;
            }
        }

        if (tecnicoLibero == null)
            return false;

        Riparazione maxPriorita = getRiparazioneMaxPriorita();

        maxPriorita.setStato(StatoRiparazione.inCorso);
        tecnicoLibero.setRiparazione(maxPriorita);

        return true;
    }


    public boolean setRiparazioneTerminata(String nomeTecnico) {
        Tecnico tecnico = cercaTecnicoPerNome(nomeTecnico);

        if (tecnico == null){
            System.out.println("nome tecnico non trovato");
            return false;
        }

        if (tecnico.getRiparazione() == null)
        {
            System.out.println("il tecnico specificato non ha una riparazione in corso");
            return false;
        }

        tecnico.getRiparazione().setStato(StatoRiparazione.terminata);
        tecnico.setRiparazione(null);

        return true;
    }

    private Tecnico cercaTecnicoPerNome(String nomeTecnico) {
        for (int i = 0; i < numTecnici; i++) {
            if (tecnici[i].getNome().equals(nomeTecnico))
                return tecnici[i];
        }

        return null;
    }

    public void mandaTecniciInFerie(String[] tecniciInFerie){
        for (String tecnicoInFerie : tecniciInFerie) {
            Tecnico t = cercaTecnicoPerNome(tecnicoInFerie);
            if(t != null)
                t.mettiInFerie();
        }
    }

    public static void main(String[] args) {
        Tecnico[] tecnici = {new Tecnico("mario"), new Tecnico("giorgio")};
        DittaRiparazioni d = new DittaRiparazioni(new Riparazione[5], tecnici);
        d.aggiungiRiparazione(new Riparazione("via roma", 4));
        d.aggiungiRiparazione(new Riparazione("via milano", 4));
        d.aggiungiRiparazione(new Riparazione("via milano2", 4));
        d.aggiungiRiparazione(new Riparazione("via milano3", 4));
        d.aggiungiRiparazione(new Riparazione("via milan4", 4));
        d.aggiungiRiparazione(new Riparazione("via milano5", 4));
        System.out.println(Arrays.toString(d.getRiparazioni()));
        System.out.println(d.getRiparazioneMaxPriorita());
        System.out.println(d.assegnaProssimaRiparazione());
        System.out.println(d.assegnaProssimaRiparazione());
        System.out.println(d.getRiparazioneMaxPriorita());
        System.out.println(!d.assegnaProssimaRiparazione());
    }

}
