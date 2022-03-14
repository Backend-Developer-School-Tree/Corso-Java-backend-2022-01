/*
Progettare un'interfaccia Iterabile che permette di fare le seguenti operazioni
- Object next() che permette di ottenere il prossimo elemento
- boolean hasNext() che indica se è presente un prossimo elemento nella sequenza
- void reset() che fa resetta l'iterazione
 */

public interface InterfacciaIterabile {
    public abstract Object next();
    public abstract boolean hasNext();
    public abstract void reset();
}