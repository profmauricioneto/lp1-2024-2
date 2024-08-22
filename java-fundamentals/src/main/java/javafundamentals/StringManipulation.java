package javafundamentals;

public class StringManipulation {
    public static void main(String[] args) {
        String name = "Mauricio Neto";
        String hello = "Hello World";

        System.out.println("Hello, I am ".concat(name).concat(hello));
        System.out.println(name.charAt(1));
        if (name.contains("ul")) {
            System.out.println("contem o padrão.");
        } else {
            System.out.println("Nao contém o padrão.");
        }
    }
}
