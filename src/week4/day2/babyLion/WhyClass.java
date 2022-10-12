package week4.day2.babyLion;

public class WhyClass {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "C",
                2,
                "365병원",
                ""
        );

        System.out.println(hospital.getDistrict());
    }
}
