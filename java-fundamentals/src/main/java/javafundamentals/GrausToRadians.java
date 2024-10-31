package javafundamentals;

import java.util.Scanner;

public class GrausToRadians {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double graus;
        double radians;

        System.out.print("Graus: ");
        graus = scan.nextDouble();

        radians = (graus*Math.PI)/180;

        System.out.print("Radius: " + radians);

        scan.close();
    }
}
