package week3.day3.fileStudy;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./"); // [./] -> 현재 디렉토리에서 파일 찾아
        File files[] = dir.listFiles(); //찾은 파일들을 files배열에 담아
        for (File file : files) {
            System.out.println(file); //반복문으로 출력해
        }
    }
}
