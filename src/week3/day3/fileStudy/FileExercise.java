package week3.day3.fileStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    private String filename;

    public FileExercise(String filename){
        this.filename = filename;
    }

    public void printFiles() {
        // 루트에 있는 파일들 출력해보는 메서드
        File dir = new File("./"); // [./] -> root 디렉토리에서 파일 찾아
        File files[] = dir.listFiles(); //찾은 파일들을 files 배열에 담아
        for (File file : files) {
            System.out.println(file); //반복문으로 출력해
        }
    }

    public String readNChars(int N) throws IOException {
        //캐릭터 n개(string) 읽는 메서드. 매개변수 n은 읽을 글자 개수?

        FileReader fileReader = new FileReader(this.filename);
        String str = ""; //str 변수 초기화

        for (int i = 0; i < N; i++) {
            // -나오면(더 읽을 글자 없으면) break
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd; //읽은 글자 쭉쭉 append
        }
        return str;

    }

    public String read2Chars(String filename) throws IOException {
        //캐릭터 두 개(=string) 읽는 메서드
        FileReader fileReader = new FileReader(filename);
        String str = ""; //init
        str += (char) fileReader.read(); //append
        str += (char) fileReader.read();
        return str;
    }

    public char readAChar(String filename) throws IOException {
        //캐릭터 한 개 읽는 메서드. 이 메서드에는 filename 매개변수가 필요해.

        FileReader fileReader = new FileReader(filename); //filename이 매개변수

        return (char) fileReader.read(); //읽은거 char 타입으로 형변화해서 반환해
    }

    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise("a_file.txt");

        //1. 한글자 읽는 메서드 실행해본거
        //char c = fileExercise.readAChar("a_file.txt");
        //readAChar 메서드를 실행해. 매개변수(filename)에는 a_file.txt를 넣을 거야. 이 파일에 있는거 읽어서 c에 넣어줘
        //System.out.println(c); //c 출력해

        //2.두글자 읽는 메서드 실행해본거
        //String output = fileExercise.read2Chars("a_file.txt");
        //System.out.println(output);

        //3.N출력 실행
        String output = fileExercise.readNChars(10); //10글자 읽어
        System.out.println(output); //출력해
    }
}
