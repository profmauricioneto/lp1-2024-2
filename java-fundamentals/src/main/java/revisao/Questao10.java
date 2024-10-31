package revisao;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite o valor de A: ");
        a = scan.nextDouble();
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            System.out.println("Digite o valor de B: ");
            b = scan.nextDouble();
            System.out.println("Digite o valor de C: ");
            c = scan.nextDouble();
            double delta = b*b - 4*a*c;
            System.out.println("Delta: " + delta);
            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else if (delta == 0) {
                double x = (-b + Math.sqrt(delta))/2*a;
                System.out.println("A equação possui uma raiz real: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta))/2*a;
                double x2 = (-b - Math.sqrt(delta))/2*a;
                System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);
            }
        }
        scan.close();
    }
}
