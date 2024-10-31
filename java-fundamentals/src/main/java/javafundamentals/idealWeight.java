package javafundamentals;

import java.util.Scanner;

public class idealWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height;
        double idealWeight;
        String gender;

        System.out.print("Height: ");
        height = scan.nextDouble();
        System.out.print("Gender: ");
        gender = scan.next();
        gender = gender.toLowerCase();
        scan.close();


        switch(gender) {
            case "male": {
                idealWeight = 72.7*height - 58;
                break;
            }
            case "female": {
                idealWeight = 62.1 * height - 44.7;
                break;
            }
            default:{
                System.out.println("Invalid gender");
                return;
            }
        }
        System.out.println("Ideal Weight is " + idealWeight + " kg");
        
    }
}
