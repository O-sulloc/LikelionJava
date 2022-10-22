package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        16진수(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)를 배운
        영일(01)이는 16진수끼리 곱하는 16진수 구구단?에 대해서 궁금해졌다.

        A, B, C, D, E, F 중 하나가 입력될 때,
        1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
        (단, A ~ F 까지만 입력된다.)

        16진수 = hex
         */

        int a = sc.nextInt(16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", a, i, a * i);

        }


    }
}

