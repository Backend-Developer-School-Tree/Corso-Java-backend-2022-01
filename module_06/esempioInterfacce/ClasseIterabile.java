public class ClasseIterabile implements InterfacciaIterabile {
    @Override
    public Object next() {
        System.out.println("Next classe Iterabile");
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void reset() {

    }
}
