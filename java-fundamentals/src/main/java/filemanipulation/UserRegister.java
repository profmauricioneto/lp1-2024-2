package filemanipulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Mauricio Moreira Neto (aka maumneto)
 * @version 1.0
 */
public class UserRegister {
    /**
     * This method prints a menu with options to user
     */
    public static void showMenu() {
        System.out.println(" --- Menu --- ");
        System.out.println("Escolha uma das opcoes a seguir: ");
        System.out.println("1 - Cadastrar Usuario ");
        System.out.println("2 - Mostrar Usuarios ");
        System.out.println("3 - Deletar Arquivo ");
        System.out.println("4 - Sair ");
        System.out.println("Option: ");
    }
    /**
     * This method is responsable to add a new user data into file
     *
     * @param file A file object to connect with txt file
     * @param data String element to be add in the file
     */
    public static void addUser(File file, String data) {
        if (file.exists()) {
            try {
                FileWriter writer = new FileWriter(file.getName(), true);
                BufferedWriter bf = new BufferedWriter(writer);
                bf.write(data);
                bf.newLine();
                System.out.println("Success in record data in " + file.getName());
                bf.flush();
                bf.close();
                writer.close();
            } catch (IOException ex) {
                System.out.println("Error: can't access file to write");
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("This file not exists");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("File created with success!");
            System.out.println("File created in: " + file.getAbsolutePath());
        }
    }
    /**
     * This file is responsable to get the user data
     *
     * @return A string element in the JSON format with name, age and address data.
     */
    /**
     * This file is responsable to get the user data
     *
     * @return A string element in the JSON format with name, age and address data.
     */
    public static String getUserData() {
        String json;
        String name, address, age;
        // reading data from user
        try (Scanner reader = new Scanner(System.in).useDelimiter("\n")) {
            // reading data from user
            System.out.print("Name: ");
            name = reader.nextLine();
            System.out.print("\n");
            System.out.print("Age: ");
            age = reader.nextLine();
            System.out.print("\n");
            System.out.print("Address: ");
            address = reader.nextLine();
            System.out.print("\n");
            reader.close();
        }
        // convert data from JSON format
        json = convertToJson(name, age, address);
        return json;
    }
        /**
         * This method take the user's information and transform in a JSON format
         * To check if the format is valid
         *
         * @return A string in the JSON format.
         *
         * @param name The user's name
         * @param age The user's age
         * @param address The user's address
         */
        public static String convertToJson(String name, String age, String address) {
            StringBuilder resultJson = new StringBuilder();
            resultJson.append("{\"name\":\"");
            resultJson.append(name);
            resultJson.append("\", \"age\":\"");
            resultJson.append(age);
            resultJson.append("\", \"address\":\"");
            resultJson.append(address);
            resultJson.append("\"}");
            return resultJson.toString();
        }
        /**
         * This method reads all data in the file
         *
         * @param file The file
         */
        public static void readLog(File file) {
            try {
                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()) {
                    String json = reader.nextLine();
                    System.out.println(json);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        /**
         * This method delete the file target
         *
         * @param file A file object to connect with txt file
         */
        public static void deleteLog(File file) {
            if (file.delete()) {
                System.out.println("File deleted with success!");
            } else {
                System.out.println("Fail in delete file!");
            }
        }
        /**
         * @param args[]
         */
        public static void main(String[] args) {
            final String filename = "log.txt";
            File file = new File(filename);
            int option;
            Scanner input = null;

            try {
                System.out.println("Welcome to File Manipulation Programming!");
                input = new Scanner(System.in).useDelimiter("\n");

                do {
                    showMenu();
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            addUser(file, getUserData());
                            break;
                        case 2:
                            readLog(file);
                            break;
                        case 3:
                            deleteLog(file);
                            break;
                        case 4:
                            System.out.println("Ending Program.");
                            break;
                        default:
                            System.out.println("Invalid Option!");
                    }
                } while (option != 4);
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        }
    }

