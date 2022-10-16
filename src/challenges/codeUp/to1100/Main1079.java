package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.

        while (true) {
            String str = sc.next();
            System.out.println(str);

            if (str.equals("q")) {
                break;
            }

        }

    }
}

