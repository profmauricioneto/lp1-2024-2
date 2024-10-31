package javafundamentals;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int acc = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("matrix[%d][%d]: ", i, j);
                matrix[i][j] = scan.nextInt();
                // captura os elementos da diagonal principal
                if (i == j) {
                    acc = acc + matrix[i][j];
                }
            }
        }
        System.out.println("Main diagonal Summation: " + acc);

        scan.close();
    }
}
