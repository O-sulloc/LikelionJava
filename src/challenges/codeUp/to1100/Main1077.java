package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
        //0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.

        int a = sc.nextInt(); //3
        /*
        System.out.println(a-3); //0
        System.out.println(a-2); //1
        System.out.println(a-1); //2
        System.out.println(a-0); //3
         */

        int b = a;
        for (int i = 0; i <= a; i++) {
            //0 1 2 3 네 번 반복

            System.out.println(a - b);
            b -= 1;
        }
    }
}

