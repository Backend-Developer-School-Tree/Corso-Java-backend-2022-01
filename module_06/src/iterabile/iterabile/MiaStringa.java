package iterabile.iterabile;

public class MiaStringa extends IterabileAbstract {
    private char[] stringa;

    public MiaStringa(String str) {
        super();
        this.stringa = str.toCharArray();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            char c = stringa[currentIndex];
            currentIndex++;
            return c;
        } else {
            System.out.println("Non ci sono più elementi!");
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < stringa.length;
    }
}
