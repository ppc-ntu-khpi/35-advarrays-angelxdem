import java.util.Random;

public class Matrix {
    private final Array array;

    public Matrix(int rows, int cols) {
        array = new Array(rows, cols);
    }

    public Matrix(int rows, int cols, int maxValue) {
        array = new Array(rows, cols);
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array.setElement(i, j, random.nextInt(maxValue));
            }
        }
    }

    public void setElement(int row, int col, int value) {
        array.setElement(row, col, value);
    }

    public int getElement(int row, int col) {
        return array.getElement(row, col);
    }

    public int getRows() {
        return array.getRows();
    }

    public int getColumns() {
        return array.getColumns();
    }

    public void transpose() {
        int rows = getRows();
        int cols = getColumns();
        Array transposedArray = new Array(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray.setElement(j, i, array.getElement(i, j));
            }
        }
        array.copyFrom(transposedArray);
    }

    public void printMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(array.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}