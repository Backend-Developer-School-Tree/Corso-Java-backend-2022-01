package negozio;

import  negozio.Giorno;

public class Negozio {

    private Prodotto[] prodotti;
    int numeroDiProdotti;

    public Negozio() {
        this.prodotti = new Prodotto[100];
        numeroDiProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        for(int i=0; i<numeroDiProdotti; i++) {
            if(prodotti[i].getCodiceProdotto().equals(prodotto.getCodiceProdotto())) {
                prodotti[i].setQuantita(prodotti[i].getQuantita() + prodotto.getQuantita());
                return;
            }
        }
        if(numeroDiProdotti < prodotti.length - 1)
            prodotti[numeroDiProdotti++] = prodotto;
        else
            System.out.println("Catalogo pieno");
    }

    private int getIndiceProdotto(Prodotto prodotto) {
        for(int i=0; i<numeroDiProdotti; i++)
            if(prodotti[i].getCodiceProdotto().equals(prodotto.getCodiceProdotto()))
                return i;
        return -1;
    }

    public void rimuoviProdotto(Prodotto prodotto) {
        int indice = getIndiceProdotto(prodotto);

        //shift
        if(indice >= 0)
            for(int i=indice; i<Math.min(numeroDiProdotti, prodotti.length - 1); i++)
                prodotti[i] = prodotti[i+1];

        numeroDiProdotti--;
    }

    public int quantitàProdotto(Prodotto prodotto) {
        int indice = getIndiceProdotto(prodotto);
        return indice >= 0 ? prodotti[indice].getQuantita() : 0;
    }

    public double acquistaProdotti(Prodotto[] prodottiDaComprare, Cliente cliente, Giorno giorno) {
        double totale = 0;
        for (Prodotto prodotto : prodottiDaComprare) {
            int quantità = quantitàProdotto(prodotto);
            if(quantità >= prodotto.getQuantita()) {
                double subTotale = prodotto.getPrezzo() * prodotto.getQuantita();
                if(cliente.getEta() >= 60 &&
                        prodotto.getGenereProdotto() == GenereProdotto.ALIMENTARE &&
                        (giorno == Giorno.lunedì || giorno == Giorno.mercoledì))
                    subTotale *= 0.8;
                totale += subTotale;
                int indice = getIndiceProdotto(prodotto);
                if(quantità - prodotto.getQuantita() == 0)
                    rimuoviProdotto(prodotto);
                else
                    prodotti[indice].setQuantita(quantità - prodotto.getQuantita());
            }
        }
        return totale;

    }

    public static void main(String[] args) {
        Prodotto p = new Prodotto( "1", "gocciole", 2.5,
                GenereProdotto.ALIMENTARE, 2);
        Prodotto p2 = new Prodotto( "2", "Svelto", 1.5,
                GenereProdotto.NON_ALIMENTARE, 3);
        Cliente c = new Cliente("1", "Mario", 89);
        Cliente c2 = new Cliente("2", "Maria", 29);
        Negozio negozio = new Negozio();
        negozio.aggiungiProdotto(p);
        negozio.aggiungiProdotto(p2);
        Prodotto p3 = new Prodotto( "1", "gocciole", 2.5,
                GenereProdotto.ALIMENTARE, 2);
        double prezzo = negozio.acquistaProdotti(new Prodotto[]{p3}, c, Giorno.venerdì);
        System.out.println(prezzo == 5.0);
        negozio.aggiungiProdotto(p);
        prezzo = negozio.acquistaProdotti(new Prodotto[]{p3}, c, Giorno.mercoledì);
        System.out.println(prezzo == 4.0);

    }
}
