import java.util.Random;

public class MatriceQuadrata {

    private int[][] matrix;

    public MatriceQuadrata(int size)
    {
        matrix = new int[size][size];
        fillMatrixRandomValues();
    }

    private void fillMatrixRandomValues()
    {
        Random random = new Random();
        for(int row = 0; row< matrix.length; row++)
            for(int col = 0; col < matrix.length; col++)
                matrix[row][col] = random.nextInt(28);
    }

    /**
     *
     */
    public void printMatrix()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix.length; col++)
                System.out.print(matrix[row][col] + " ");
            System.out.println();
        }
    }


    public int sumDiagonal(VersoDiagonale versoDiagonale)
    {
        int sum = 0;
        if(versoDiagonale == VersoDiagonale.SINISTRA)
            for(int index = 0; index < matrix.length; index++)
                sum += matrix[index][index];
            else
                for(int index = 0; index < matrix.length; index++)
                    sum += matrix[index][matrix.length - 1 - index];
        return sum;
    }
}
