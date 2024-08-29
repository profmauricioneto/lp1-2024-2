package javafundamentals;

import java.util.Scanner;

public class FibonacciSequence {

    public static void fibonacci(int terms) {
        int a = 0, b = 1;
        int aux;
        if (terms == 1) {
            System.out.println("0");
        } else if (terms == 2) {
            System.out.println("0\n1");
        } else {
            System.out.println("0\n1");
            for (int i = 3; i <= terms; i++) {
                aux = a + b;
                System.out.println(aux);
                a = b;
                b = aux;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int terms;
        System.out.println("Enter the number of terms : ");
        terms = scan.nextInt();
        fibonacci(terms);
    }
}
