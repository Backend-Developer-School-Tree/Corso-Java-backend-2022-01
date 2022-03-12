package iterabile.iterabile;

public abstract class IterabileAbstract implements Iterabile {
    protected int currentIndex;

    protected IterabileAbstract() {
        this.currentIndex = 0;
    }

    @Override
    public void reset() {
        this.currentIndex = 0;
    }
}
