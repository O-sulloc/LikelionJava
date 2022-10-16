package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.

        int a = sc.nextInt(); //5

        for (int i = 0; i < a; i++) {
            System.out.println(a-i); //5
        }

    }
}

