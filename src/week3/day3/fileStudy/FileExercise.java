package week3.day3.fileStudy;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./"); // [./] -> root 디렉토리에서 파일 찾아
        File files[] = dir.listFiles(); //찾은 파일들을 files 배열에 담아
        for (File file : files) {
            System.out.println(file); //반복문으로 출력해
                   /* ./out
                    ./README.md
                    ./.gitignore
                    ./.git
                    ./LikelionJava.iml
                    ./a_file.txt
                    ./.idea
                    ./src */
        }

    }
}
