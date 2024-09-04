package filemanipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulation {
    public static void createFile(String filename) throws IOException {
        File myfile = new File(filename.concat(".txt"));
        if (myfile.createNewFile()) {
            System.out.println("File Created:" + myfile.getName());
        } else {
            System.out.println("File already exists.");
        }
    }

    public static void writeInFile(String filename, String message) {
//        FileWriter writer = new FileWriter(filename.concat("txt"), true);
//        if (filename.exists()) {
//            writer.write(message);
//            System.out.println("Write in file successfully.");
//        } else {
//            throw new IOException("Error in write in file.");
//        }
        try{
            FileWriter writer = new FileWriter(filename.concat(".txt"), true);
            writer.write(message);
            writer.write("\n");
            System.out.println("Write in file successfully.");
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void readFile(String filename) {
        try {
            File myfile = new File(filename.concat(".txt"));
            Scanner reader = new Scanner(myfile);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filename;
        System.out.println("Filename: ");
        filename = scan.next();
        int option;

        do {
            System.out.println("1- Create a file\n 2- Write in file\n 3- Delete the file\n 4- Exit");
            option = scan.nextInt();

            switch (option) {
                case 1: {
                    try {
                        createFile(filename);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Message: ");
                    String message = scan.next();
                    writeInFile(filename, message);
                    break;
                }

            }

        } while(option != 4);

    }
}
