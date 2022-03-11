package lista.lista;

import java.util.Arrays;

public class MiaStringa extends ListaAbstract {

    public MiaStringa() {
        super();
    }

    @Override
    public void add(Object o) {
        if (o instanceof Character) {
            lista = Arrays.copyOf(lista, lista.length + 1);
            lista[lista.length - 1] = o;
        } else {
            System.out.println("Non è possibile aggiungere l'elemento nella lista!");
        }
    }

    @Override
    public boolean contains(Object o) {
        if (!(o instanceof Character))
            return false;
        for (int i = 0; i < this.lista.length; i++) {
            if (((Character) o).equals(this.lista[i])) {
                return true;
            }
        }
        return false;
    }
}
