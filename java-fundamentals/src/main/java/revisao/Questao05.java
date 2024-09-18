package revisao;

import java.util.Scanner;

public class Questao05 {

    public static void matrixGenerator(int rows, int cols) {
        Scanner scan = new Scanner(System.in);
        if (rows != cols) {
            System.out.println("Not a squared matrix.");
        } else {
            int matrix[][] = new int[rows][cols];
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("matrix[%d][%d]: ", i, j);
                    matrix[i][j] = scan.nextInt();
                    if (i == j) {
                        sum += matrix[i][j];
                    }
                }
            }
            System.out.println("Valor da diagonal principal é: " + sum);
            scan.close();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows, cols;
        System.out.println("Rows: ");
        rows = scan.nextInt();
        System.out.println("Cols: ");
        cols = scan.nextInt();
        matrixGenerator(rows, cols);
        scan.close();
    }
}
