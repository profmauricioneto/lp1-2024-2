package org.unichristus;

import java.util.Scanner;

public class StudentSituation {
    public static void main(String[] args) {
        double np1, np2, np3, mf;
        String situation;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter with NP1: ");
        np1 = scan.nextDouble();
        System.out.print("Enter with NP2: ");
        np2 = scan.nextDouble();
        System.out.print("Enter with NP3: ");
        np3 = scan.nextDouble();

        if (np3 < 4.0) {
            situation = "Failed";
        } else {
            mf = (np1 + np2 + np3)/3;
            System.out.println("Grade Average is " + mf);
            if (mf >= 5.0) {
                situation = "Passed";
            } else {
                situation = "Failed";
            }
        }
        System.out.println("Situation is: " + situation);
        scan.close();
    }
}
