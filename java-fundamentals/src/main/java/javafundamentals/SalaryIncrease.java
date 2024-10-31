package javafundamentals;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary;
        double percentage;

        System.out.print("Enter salary: ");
        salary = scan.nextDouble();
        System.out.print("Enter percentage: ");
        percentage = scan.nextDouble();

        double salaryIncrease = salary * percentage;
        double newSalary = salary + salaryIncrease;

        System.out.printf("New salary: %.2f\n", newSalary);
        System.out.println("Percentage Salary: " + salaryIncrease);
        
        scan.close();
    }
}
