package provanp1;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorCompra, desconto = 0;
        int idade;
        System.out.print("Idade: ");
        idade = scan.nextInt();
        System.out.println("Valor da Compra: ");
        valorCompra = scan.nextDouble();

        if (idade < 18) {
            desconto = 0.15;
        } else if (idade > 60) {
            desconto = 0.2;
        } else {
            System.out.println("Sem desconto.");
        }

        System.out.println("Cliente");
        System.out.println("Idade: " + idade);
        System.out.println("Valor da Compra: " + valorCompra);
        System.out.println("Valor do Desconto: " + (valorCompra*desconto));
        System.out.println("Valor a ser Pago: " + (valorCompra - valorCompra*desconto));
    }
}
