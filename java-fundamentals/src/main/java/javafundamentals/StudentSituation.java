package javafundamentals;

import java.util.Scanner;

public class StudentSituation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade1, grade2, average;
        String situation;
        System.out.print("Grade 1: ");
        grade1 = scan.nextDouble();
        System.out.print("Grade 2: ");
        grade2 = scan.nextDouble();

        average = (grade1 + grade2) / 2;
        System.out.println("Average grade: " + average);

        if (average >= 7.0) {
            situation = "Approved";
        } else {
            if (average < 4.0) {
                situation = "Rejected";
            } else {
                situation = "Final";
                System.out.println(situation);
                double finalGrade, finalAverage;
                System.out.print("Final Grade: ");
                finalGrade = scan.nextDouble();
                System.out.println("Average grade: " + finalGrade);
                finalAverage = (finalGrade + average) / 2;

                if (finalAverage >= 5.0) {
                    situation = "Approved in Final";
                } else {
                    situation = "Rejected in Final";
                }
            }
        }
        System.out.println("Situation: " + situation);
        scan.close();
    }
}
