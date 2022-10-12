package week4.day2.babyLion;

public class Water2 {
    public static void main(String[] args) {
        int num = 5;
        String str = "";

        for (int i = 0; i < 5; i++) { //숫자만큼 반복돼야 하니까
            if(i % 2 == 0){ //0%2=0, 2%2=0, 4%2=0 ...
                str += "수";
            }else {
                str += "박"; //1%2=1, 3%2=1...
            }
        }

        System.out.println(str);
    }
}
