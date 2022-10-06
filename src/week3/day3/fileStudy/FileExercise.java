package week3.day3.fileStudy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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

    public List<String> readAllLine() throws IOException{
        //모든 줄 읽는 메서드. Files 클래스의 readAllLines 메서드를 사용한다.

        List<String> lines;

        lines = Files.readAllLines(Paths.get(this.filename));

        return lines;
    }

    public String readLine() throws IOException{
        //한 줄 읽는 메서드. bufferedReader 클래스의 readLine 메소드를 사용한다.
        BufferedReader bf = new BufferedReader(new FileReader(this.filename));

        String line=bf.readLine();

        return line;
    }

    public String readNChars(int N) throws IOException {
        //캐릭터 n개(string) 읽는 메서드. 매개변수 n은 읽을 글자 개수

        FileReader fileReader = new FileReader(this.filename);
        String str = ""; //str 변수 초기화

        for (int i = 0; i < N; i++) {
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                // -1 나오면(더 읽을 글자 없으면) break
                return str;
            }
            str += (char) asciiCd; //읽은 글자 append
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

        return (char) fileReader.read(); //읽은거 int형이니까 char 타입으로 형변화해서 반환해. 보고싶은건 글자니까
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
        //String output = fileExercise.readNChars(10); //10글자 읽어
        //System.out.println(output); //출력해

        //4.한줄 출력해보기
        //String output = fileExercise.readLine();
        //System.out.println(output);

        //5. 모든 문장 출력해보기
        String output = fileExercise.readAllLine().toString();
        System.out.println(output);
    }
}
