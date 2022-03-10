package distributore_bevande;

public class DistributoreDiBevande {

    private double importoAttuale;
    private ProdottoDistributore[] prodotti;

    public DistributoreDiBevande(int capienza) {
        this.prodotti = new ProdottoDistributore[capienza];
        this.importoAttuale = 0;
    }

    public void caricaProdotto(ProdottoDistributore prodotto) {
        for(int i=0; i<prodotti.length; i++)
            if (prodotti[i] == null) {
                prodotti[i] = prodotto;
                break;
            }
    }

    public void rimuoviProdotto(int indice) {
        //shift left
        for(int i=indice; i<prodotti.length-1; i++)
            prodotti[i] = prodotti[i+1];
        prodotti[prodotti.length-1] = null;
    }

    public void inserisciImporto(double importo) {
        importoAttuale += importo;
    }

    public ProdottoDistributore scegliProdotto(String codice) {
        ProdottoDistributore prodotto = null;

        for(int i=0; i<prodotti.length; i++)
            if (prodotti[i] != null && prodotti[i].getCodice().equals(codice)) {
                if(prodotti[i].getPrezzo() <= importoAttuale) {
                    importoAttuale -= prodotti[i].getPrezzo();
                    prodotto =  prodotti[i];
                    rimuoviProdotto(i);
                    break;
                }
            }
        return prodotto;
    }

    public double saldoAttuale() {
        return importoAttuale;
    }

    public double getResto() {
        double app = importoAttuale;
        importoAttuale = 0;
        return  app;
    }

    public static void main(String[] args) {
        Caffe caffe = new Caffe(0.5);
        Cappuccino cappuccino = new Cappuccino(1);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        distributoreDiBevande.inserisciImporto(0.4);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(0.2);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(2.0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.scegliProdotto("cappuccino") != null);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
    }

}