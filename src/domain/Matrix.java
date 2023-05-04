import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public Matrix(int rows, int cols, int maxValue) {
        matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(maxValue);
            }
        }
    }

    public void setElement(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public int getElement(int row, int col) {
        return matrix[row][col];
    }

    public int getRows() {
        return matrix.length;
    }

    public int getColumns() {
        return matrix[0].length;
    }

    public void transpose() {
        int rows = getRows();
        int cols = getColumns();
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        matrix = transposedMatrix;
    }

    public void printMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}