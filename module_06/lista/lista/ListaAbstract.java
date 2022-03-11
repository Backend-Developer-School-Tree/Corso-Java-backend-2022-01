package lista.lista;

import java.util.Arrays;

public abstract class ListaAbstract implements Lista {
    protected Object[] lista;

    protected ListaAbstract() {
        lista = new Object[0];
    }

    @Override
    public Object get(int i) {
        if (i >= 0 && i < lista.length) return lista[i];
        else {
            System.out.println("Indice non corretto!");
            return null;
        }
    }

    @Override
    public int size() {
        return lista.length;
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i >= lista.length) return false;

        for (int j = i; j < lista.length; j++) {
            if (j == lista.length - 1) lista[j] = null;
            else lista[j] = lista[j + 1];
        }
        lista = Arrays.copyOf(lista, lista.length - 1);
        return true;
    }

    @Override
    public void clear() {
        lista = new Object[0];
    }
}
