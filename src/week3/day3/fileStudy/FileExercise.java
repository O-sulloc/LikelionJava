package week3.day3.fileStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    public void printFiles(){
        File dir = new File("./"); // [./] -> root 디렉토리에서 파일 찾아
        File files[] = dir.listFiles(); //찾은 파일들을 files 배열에 담아
        for (File file : files) {
            System.out.println(file); //반복문으로 출력해
        }
    }

    public String read2Chars(String filename) throws IOException{
        //캐릭터 두 개(=string) 읽는 메서드
        FileReader fileReader = new FileReader(filename);
        String str ="";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public char readAChar(String filename) throws  IOException{
        //캐릭터 한 개 읽는 메서드
        //이 메서드를 실행하려면 filename 매개변수가 필요해.
        FileReader fileReader = new FileReader(filename); //filename이 매개변수로 넣어

        return (char) fileReader.read(); //읽은거 char타입으로 형변화해서 반환해
    }

    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();

        /* 1. 한글자 읽는 메서드 실행해본거
        char c = fileExercise.readAChar("a_file.txt");
        //readAChar 메서드를 실행해. 매개변수(filename)에는 a_file.txt를 넣을거야. 이 파일에 있는거 읽어서 c에 넣어줘
        System.out.println(c); //c 출력해 */

        //2.두글자 읽는 메서드 실행해본거
        String output = fileExercise.read2Chars("a_file.txt");
        System.out.println(output);
    }
}
