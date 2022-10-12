package week4.day2.babyLion;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.gugudanMul(2);
    }

    public void gugudanMul(int dan) {
        //몇 단 출력할 건지는 파라미터로 받아서
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan * i);
        }
    }

    //기호도 파라미터로 받을 수 있나?
    public void gugudanPlus(){

    }
}
