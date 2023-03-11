import java.util.Arrays;
public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matrix= {
            {2, 3, 4},
            {5, 6, 4}
        };

        int[][] mTranspozu = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                mTranspozu[i][j] = matrix[j][i];
            }
        }

        matrixPrint(matrix);
        System.out.println("==========");
        matrixPrint(mTranspozu);

    }

    static void matrixPrint(int[][] matrix){
        for (int row[]: matrix) {
            for (int col: row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
