package javafundamentals;

import java.util.Scanner;

public class DifferenceSumQuad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumQuad = 0;
        int quadSum = 0;
        int terms;
        int initial = 1;

        System.out.print("Amount of terms: ");
        terms = scan.nextInt();

        while(initial <= terms) {
            sumQuad = sumQuad + initial*initial;
            //sumQuad += terms*terms;
            quadSum = quadSum + initial;
            initial++;
        }
        quadSum = quadSum*quadSum;
        int difference = quadSum - sumQuad;
        System.out.printf("Sum of Squares: %d - Square of the Sum %d = %d ", quadSum, sumQuad, difference);
    }
}
