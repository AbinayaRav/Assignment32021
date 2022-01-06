import java.util.*;

public class ARQuestion4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the row size of the matrix : ");
        int rowSize = scan.nextInt();
        System.out.println("Please enter the column size of the matrix : ");
        int colSize = scan.nextInt();
        int[][] matrix1 = new int[rowSize][colSize];
        int[][] matrix2 = new int[rowSize][colSize];
        System.out.println("Please enter the elements of matrix 1 : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Please enter the elements of matrix 2 : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("The sum of the two matrices : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

    }

}