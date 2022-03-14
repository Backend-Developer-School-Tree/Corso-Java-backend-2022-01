public class ClasseIterabile2 implements InterfacciaIterabile {
    @Override
    public Object next() {
        System.out.println("Next class Iterabile 2");
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
