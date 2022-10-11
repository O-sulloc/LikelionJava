package week3.day4.project2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    public PopulationMove parse(String data) {
        String[] splitData = data.split(","); //쉼표로 쪼갠 데이터를 배열에 넣음

        //return new PopulationMove(splitData[0], splitData[6]); //생성자는 int타입임
        return new PopulationMove(splitData[0], splitData[1]);// 메인에서 4. 실행했으니까 한이제 배열에 0,1만 있음. 전입,전출
    }

    public List<PopulationMove> readByLine(String filename) throws IOException {
        //한 줄씩 출력해보는 메서드. bufferedReader class로

        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = bf.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }

        bf.close();

        return pml;
    }

    public void createAFile(String filename) {
        // 파일 만드는 메서드. file class 사용
        File file = new File(filename); //파일 만드는데 파일 이름 뭘로 할건지 매개변수로 받아와야됨

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) { //데이터를 넣을 건데. 그 데이터가 List타입이야. 그러니까 매개변수에도 List
        //파일 위에 데이터 넣는 건 (글 쓰는 건) bufferedwriter 클래스 사용해서
        File file = new File(filename);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                bw.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        // 이제 이 메서드를 사용해서 어디서 어디로 전입전출했는지 카운트를 셀거야
        //<11,12, 123>이면 11에서 12로 이사간 횟수가 123번

        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) { //pml데이터를 하나씩 꺼내서 Pm에 넣어줘
            String key = pm.getFromSido() + "," + pm.getToSido(); //"11,12" 형식의 키값을 만들었음

            if (moveCntMap.get(key) == null) {
                // "11,12"이라는 키값으로 vlaue를 불러와. 근데 거기 null이 저장되어 있어? (서울에서 인천으로 이사 간 횟수가 null)
                moveCntMap.put(key, 1); //그럼 "11,12"의 밸류에 1을 넣어
            } else {
                //"11,12" 키값의 밸류에 null이 아닌 값이 저장되어 있어?
                moveCntMap.put(key, moveCntMap.get(key) + 1); //그럼 +1해
            }
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        /*
        // 1. readByLine 실행해보기
        String address = "/Users/jeonghyeonkim/Downloads/2021_인구관련연간자료_20221007_35264.csv"; //이 주소로 찾아가서 파일 읽어
        PopulationStatistics ps = new PopulationStatistics();
        ps.readByLine(address); //readbyline 메서드를 실행해. 주소는 위에 넣어둠
         */

        /*
        // 2. create A File 실행해보기
        PopulationStatistics ps = new PopulationStatistics();
        ps.createAFile("from_to2.txt"); //파일 만들어. 파일 이름은 from_to2.txt
         */

        // 3. pml에 있는 데이터를 strings에 넣어보기
        /*
        String address = "/Users/jeonghyeonkim/Downloads/2021_인구관련연간자료_20221007_35264.csv";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(address); //readByLine 메서드로 읽어온 한 줄 한 줄을 pml 배열에 넣어줘
        List<String> strings = new ArrayList<>();

        for (PopulationMove pm : pml) { //pml 배열에 있는 줄들 꺼내서 pm에 넣어줘
            //System.out.printf("전입:%s 전출: %s\n", pm.getFromSido(), pm.getToSido()); //전입:27 전출: 27이런 식으로 출력됨

            String fromTo = pm.getFromSido() + "," + pm.getToSido()+"\n";
            //위에서 뽑아온 27 27을 "27,27" 형식으로 가공해서 fromTo에 넣어줘
            strings.add(fromTo); //"27,27" 이거를 이제 List<String> strings에 넣어줘
        }

        ps.write(strings, "from_to2.txt"); //from_to2 텍파에 가공한 자료 넣기. 이제 2021_인구관련연간자료_20221007_35264.csv는 필요 없어
        */

        //4.
        String address = "from_to2.txt";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(address); //readByLine 메서드로 읽어온 한 줄 한 줄을 pml 배열에 넣어줘
        System.out.println(pml);
        //Map<String, Integer> map = ps.getMoveCntMap(pml); //pml에 있는 데이터를 map에 넣어줘
        //System.out.println(map);
        //ps.createAFile("from_to_sido_cnt.txt");
        //List<String> cntResult = new ArrayList<>();

        //for(String key:map.keySet()){
        //    System.out.printf("key:");
        //}
    }
}
