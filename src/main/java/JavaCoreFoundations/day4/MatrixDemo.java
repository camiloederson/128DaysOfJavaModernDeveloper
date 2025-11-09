package JavaCoreFoundations.day4;

public class MatrixDemo {
    public static void main(String[] args){
        int[][] matrix = new int [3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * 3 + j + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
