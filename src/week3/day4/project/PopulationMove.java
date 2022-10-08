package week3.day4.project;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int fromSido; //전출
    private int toSido; //전입

    private Map<Integer, String> sidoMap = new HashMap<>();

    private String fromSidoKorean;
    private String toSidoKorean;

    public PopulationMove(int fromSido, int toSido) {
        //constructor 추가: fromsido, tosido를 받아서 멤버 변수에 넣어줌
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public void setSidoMap() {
        sidoMap.put(11, "서울특별시");
        sidoMap.put(26, "부산광역시");
        sidoMap.put(27, "대구광역시");
        sidoMap.put(28, "인천광역시");
        sidoMap.put(29, "광주광역시");
        sidoMap.put(30, "대전광역시");
        sidoMap.put(31, "울산광역시");
        sidoMap.put(41, "경기도");
        sidoMap.put(42, "강원도");
        sidoMap.put(43, "충청북도");
        sidoMap.put(44, "충청남도");
        sidoMap.put(45, "전라북도");
        sidoMap.put(46, "전라남도");
        sidoMap.put(47, "경상북도");
        sidoMap.put(48, "경상남도");
        sidoMap.put(50, "제주특별자치도");
    }

    //getter

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }

}
