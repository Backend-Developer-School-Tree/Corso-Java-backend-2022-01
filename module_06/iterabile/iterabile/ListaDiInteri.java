package iterabile.iterabile;

public class ListaDiInteri extends IterabileAbstract {
    private int[] interi;

    public ListaDiInteri(int[] interi) {
        super();
        this.interi = interi;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            int i = interi[currentIndex];
            currentIndex++;
            return i;
        } else {
            System.out.println("Non ci sono più elementi!");
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < interi.length;
    }
}
