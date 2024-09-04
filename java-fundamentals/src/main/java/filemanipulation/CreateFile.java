package filemanipulation;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myfile = new File("teste.txt");
        try {
            myfile.createNewFile();
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
