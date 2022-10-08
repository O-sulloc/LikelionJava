package week3.day4.project;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public List<PopulationMove> readFileByLine(String filename) throws IOException {
        //한 줄씩 읽는 메서드. bufferedreader 사용.

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
            //System.out.println(str);
            PopulationMove pm = parse(str); //string을 populationmove로 파싱
            pml.add(pm); //파싱한걸 다시 pml에 넣어
        }
        reader.close();

        return pml; //파일 다 읽어서 파싱 끝나면 리턴
    }

    public void readByLine2(String filename) throws IOException{
        //Files.newBufferedReader 최근에 자주 사용
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        //한 줄 읽고 [,]로 스플릿 -> 스플릿한 한 줄의 데이터를 populationMove로 리턴하는 메서드

        String[] parsedData = data.split(",");

        return new PopulationMove(Integer.parseInt(parsedData[0]), Integer.parseInt(parsedData[1])); //from to
    }

    public void createAFile(String filename) {
        //필요한 부분만 추출해서 파일로 만드는 메서드

        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        // createAfile메서드로 from_to.txt파일 생성했음
        // 이 생성한 파일에 데이터를 넣는 메서드. List<String> 데이터

        File file = new File(filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fromToString(PopulationMove populationMove) {
        //pm을 string으로 가공
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();

        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();

        //한 줄 넣고 파싱해보기
        //PopulationMove populationMove=populationStatistics.parse("50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528");
        //System.out.printf("toSido: %d fromSido: %d", populationMove.getToSido(), populationMove.getFromSido());

        //list 형식으로 받아옴
        //List<PopulationMove> pml = populationStatistics.readFileByLine(address);
        //System.out.println(pml.size());


        //populationStatistics.createAFile("from_to.txt"); //vv파일 생성
        //List<PopulationMove> pml = populationStatistics.readFileByLine(address);
        //List<String> strings = new ArrayList<>();
        //for (PopulationMove pm : pml) {
        //System.out.printf("전입:%s 전출:%s \n", pm.getFromSido(), pm.getToSido());
        //String fromTo = populationStatistics.fromToString(pm);
        //strings.add(fromTo);
        //}

        //strings.add("11,11");

        //populationStatistics.write(strings, "./from_to.txt");

        List<PopulationMove> pml = populationStatistics.readFileByLine(address);
        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);

        //populationStatistics.createAFile("fromToSidoCnt.txt"); //파일 만듬

        List<String> cntResult = new ArrayList<>();

        for(String key:map.keySet()) {
            //System.out.printf("key:%s value:%d\n", key, map.get(key));
            String s = String.format("key:%s value:%d\n", key, map.get(key));
            cntResult.add(s);
        }
        populationStatistics.write(cntResult, "fromToSidoCnt.txt"); //데이터 잘 wirte했어
    }
}
