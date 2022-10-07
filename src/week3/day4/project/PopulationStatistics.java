package week3.day4.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PopulationStatistics {
    public void readFileByCharacter(String filename) throws IOException {
        //파일 리더로 한 글자씩 읽는 메서드
        FileReader fileReader = new FileReader(filename);

        String fileCon = "";
        while (fileCon.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileCon += c;
        }
        System.out.println(fileCon);
    }

    public void readFileByLine(String filename) throws IOException {
        //한 줄씩 읽ㅇ는 메서드. 매개변수로 파일 이름 받음.

        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            PopulationMove pm = parse(str);
        }
        reader.close();
    }

    //public void readFileByLine2(String filename) throws IOException {    }

    public PopulationMove parse(String data) {
        //file 읽고 ,로 스플릿 -> 한 줄의 데이터를 populationMove로 리턴하는 메서드

        String[] parsedData = data.split(",");

        return new PopulationMove(Integer.parseInt(parsedData[0]), Integer.parseInt(parsedData[6]));
    }

    public static void main(String[] args) throws IOException {
        String address = "/Users/jeonghyeonkim/Downloads/2021_인구관련연간자료_20221007_35264.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();

        PopulationMove populationMove=populationStatistics.parse("50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528");
        System.out.printf("toSido: %d fromSido: %d", populationMove.getToSido(), populationMove.getFromSido());

    }
}
