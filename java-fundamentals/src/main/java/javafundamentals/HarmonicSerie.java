package javafundamentals;

import java.util.Scanner;

public class HarmonicSerie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hn = 0;
        int terms;

        System.out.print("Amount of terms: ");
        terms = scan.nextInt();

        for (int i = 1; i <= terms; i++) {
            hn = hn + (double)1/i;
        }
        System.out.println("Harmonic Serie value: " + hn);

        scan.close();
    }
}
