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
        //한 줄씩 읽는 메서드. bufferedReader 사용.

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
        //Files.newBufferedReader 최근에 자주 사용하는 클래스
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

        String[] parsedData = data.split(","); //파싱한 결과를 배열에 넣어

        //return new PopulationMove(Integer.parseInt(parsedData[0]), Integer.parseInt(parsedData[6])); //배열 0,6번에 전입 전출 데이터가 있어.
        return new PopulationMove(Integer.parseInt(parsedData[0]), Integer.parseInt(parsedData[1])); // 메인에서 4. 실행해서 이제 배열에 2개의 데이터만 있어. 0전입 1전출
    }

    public void createAFile(String filename) {
        // 파일 만드는 메서드. file 클래스를 사용한다.

        File file = new File(filename); //파일 이름 뭘로 할 건지 filename 매개변수로 줘야함.
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        // createAfile메서드로 from_to.txt파일 생성했음
        // 이 파일에 데이터를 넣는 메서드. 매개변수는 List<String> 타입임. 왜냐하면 넣을 데이터가 list타입이기 때문이다.
        // 글 쓰기 위해 bufferedWriter 클래스를 사용한다.

        File file = new File(filename); //어떤 파일에 글 쓸건지 파일 이름을 알려줘야함

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
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n"; // "27,27" 개행
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        //이 메서드를 사용해서 어디서 어디로 이사갔는지 카운트를 셀 것임.
        //<11:12, 123>이면 11에서 12로 이사간 횟수가 123번

        Map<String, Integer> moveCntMap = new HashMap<>(); //11:12는 string, 횟수는 integer

        for (PopulationMove pm : pml) { //pml데이터 하나씩 꺼내서 Pm에 넣어
            String key = pm.getFromSido() + "," + pm.getToSido(); //"11,12" 형식의 키값을 만들었음
            if (moveCntMap.get(key) == null) {
                //"11,12"라는 키값으로 value 찾아. 근데 거기 Null이 저장되어 있어? (서울에서 인천으로 이사간 횟수가 null)
                moveCntMap.put(key, 1); //그럼 11,12 밸류에 1 넣어줘
            }
            //널이 아니다?
            moveCntMap.put(key, moveCntMap.get(key) + 1); //그럼 +1해
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        /*
        // 1. 한 줄 넣고 파싱해보기
        PopulationStatistics ps = new PopulationStatistics();
        PopulationMove populationMove=ps.parse("50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528");
        System.out.printf("toSido: %d fromSido: %d", populationMove.getToSido(), populationMove.getFromSido());
         */

        /*
        // 2. 한줄씩 읽는 메서드(readFileByLine) 실행
        String address = "/Users/jeonghyeonkim/Downloads/2021_인구관련연간자료_20221007_35264.csv";
        PopulationStatistics ps = new PopulationStatistics();
        ps.readFileByLine(address); // 이 주소로 가서 파일 읽어
         */

        /*
        // 3. create a file 실행해서 파일 만들어보기
        ps.createAFile("from_to.txt"); //파일 생성
         */

        /*
        // 4.from_2 텍파에 필요한 자료(11:12)만 가공해서 넣기
        List<PopulationMove> pml = ps.readFileByLine(address); //readFileByLine 메서드로 읽어온 것들 한 줄씩 pml에 넣어

        List<String> strings = new ArrayList<>();

        for (PopulationMove pm : pml) { //pml에 있는거 다시 한 줄씩 꺼내서 pm에 넣어
            System.out.printf("전입:%s 전출:%s \n", pm.getFromSido(), pm.getToSido());  //양식 맞춰 pm 프린트해보면 전입:27 전출:27이런 식으로 출력됨

            String fromTo = ps.fromToString(pm); // FromToString 메서드 실행. 27 27을 "27,27" 형식으로 가공해서 fromTo에 넣어줘.
            strings.add(fromTo); //FromTo에 있는걸 꺼내서 List Strings에 넣어줘
        }

        ps.write(strings, "./from_to.txt"); //strings 데이터를 from_to 파일에 담아줘. 이제 2021_인구관련연간자료_20221007_35264.csv는 필요 없어
         */

        /*
        // 5. <11,12, 12331> 데이터 만들어서 cnt 파일에 넣기
        List<PopulationMove> pml = ps.readFileByLine(address); //이제 from_to에 있는 자료 한 줄씩 일어서 pml에 넣어줘
        Map<String, Integer> map = ps.getMoveCntMap(pml); //pml에 있는거 Map에 넣어줘

        ps.createAFile("fromToSidoCnt.txt"); //카운트 세는 map형식 데이터 넣을 파일 만들어줘

        List<String> cntResult = new ArrayList<>();

        for(String key:map.keySet()) {
            //System.out.printf("key:%s value:%d\n", key, map.get(key)); //key:44,27 value:2146
            String s = String.format("key:%s value:%d\n", key, map.get(key)); //key:44,27 value:2146 이 포맷으로 데이터 가공해서 s에 넣어라
            cntResult.add(s);//cntResult에 s다시 옮겨 담고
        }
        ps.write(cntResult, "fromToSidoCnt.txt"); //catResult 데이터 fromToSidoCnt텍파에 추가해
         */
    }
}
