package javafundamentals;

import java.util.Scanner;

public class MoneyMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialAmount;
        int cash50, cash10, cash5, cash1;

        System.out.print("Enter the amount of cash: ");
        initialAmount = scan.nextInt();

        cash50 = initialAmount / 50;
        initialAmount = initialAmount % 50;
        System.out.println("Cash 50: " + cash50);

        cash10 = initialAmount / 10;
        initialAmount = initialAmount % 10;
        System.out.println("Cash 10: " + cash10);

        cash5 = initialAmount / 5;
        initialAmount = initialAmount % 5;
        System.out.println("Cash 5: " + cash5);

        cash1 = initialAmount;
        System.out.println("Cash 1: " + cash1);
    }
}
