public class Test {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3, 10);

        System.out.println("Original matrix:");
        matrix.printMatrix();

        System.out.println("Transposed matrix:");
        matrix.transpose();
        matrix.printMatrix();
    }
}
