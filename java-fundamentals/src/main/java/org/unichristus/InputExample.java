package org.unichristus;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.print("Enter with your age: ");
        age = scan.nextInt();
        System.out.println("Your age is: " + age);
    }
}
