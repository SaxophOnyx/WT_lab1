package tasks.task_6;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[] vector) {
        matrix = new int[vector.length][];

        int borderIndex = 0;
        for (int row = 0; row < matrix.length; ++row) {
            matrix[row] = new int[vector.length];

            int col = 0;
            for (int i = borderIndex; i < vector.length; ++i) {
                matrix[row][col] = vector[i];
                ++col;
            }

            for (int i = 0; i < borderIndex; ++i) {
                matrix[row][col] = vector[i];
                ++col;
            }

            ++borderIndex;
        }
    }

    public void print() {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%2d ", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}
