package provanp1;

import java.util.Scanner;

public class Questao06 {

    public static void processarNotas(String nome, double[] notas) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota[%d]: ", i);
            notas[i] = scan.nextDouble();
            media += notas[i];
        }
        media = media/3;
        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);

        scan.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double notas[] = new double[3];
        String nome;

        for(int i = 0; i < 3; i++) {
            System.out.println("Nome: ");
            nome = scan.next();
            processarNotas(nome, notas);
        }

        scan.close();

    }
}
