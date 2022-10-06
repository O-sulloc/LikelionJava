package week3.day3.fileStudy;

import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./a_file.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
}
