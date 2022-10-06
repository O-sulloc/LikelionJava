package week3.day3.fileStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewBufferedReader {
    public void read() {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get("a_file.txt"), StandardCharsets.UTF_8)) {
            //버퍼리더의 두번째 파라미터는 버퍼의 크기를 의미. (StandardCharsets.UTF_8)

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); //null값이 아니면 출력해줘
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readNByte(){

    }

    public static void main(String[] args) {
        NewBufferedReader newBufferedReader = new NewBufferedReader();
        newBufferedReader.read();
    }
}
