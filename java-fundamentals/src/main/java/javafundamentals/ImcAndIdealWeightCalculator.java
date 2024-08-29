package javafundamentals;

import java.util.Scanner;

public class ImcAndIdealWeightCalculator {

    public static double imcCalculator(double weight, double height) {
        return weight / (height * height);
    }

    public static double idealWeigthCalculator(String gender, double height) {
        double idealWeight = 0.0;
        if (gender.equalsIgnoreCase("male")) {
            idealWeight = (72.7 * height) - 58;
        } else if (gender.equalsIgnoreCase("female")) {
            idealWeight = (62.1 * height) - 44.7;
        } else {
            System.out.println("Invalid gender");
        }
        return idealWeight;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currentWeight;
        double height;
        String gender;

        System.out.print("Current weight: ");
        currentWeight = scan.nextDouble();
        System.out.print("Height: ");
        height = scan.nextDouble();
        System.out.print("Gender (male/female): ");
        gender = scan.next();

        double imc = imcCalculator(currentWeight, height);
        double idealWeight = idealWeigthCalculator(gender, height);

        System.out.println("IMC Result: " + imc);
        System.out.println("Ideal Weight Result: " + idealWeight);
    }
}
