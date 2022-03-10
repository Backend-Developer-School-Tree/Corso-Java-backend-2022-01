public class Main {

    public static void main(String[] args) {
        MatriceQuadrata mq = new MatriceQuadrata(5);
        mq.printMatrix();
        System.out.println(mq.sumDiagonal(VersoDiagonale.SINISTRA));
        System.out.println(mq.sumDiagonal(VersoDiagonale.DESTRA));
    }
}
