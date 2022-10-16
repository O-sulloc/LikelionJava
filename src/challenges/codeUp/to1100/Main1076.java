package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자. 줄바꿈x 공백으로

        char alpha = sc.next().charAt(0);
        // a=97 b=98 c=99 d=100

        /*
        System.out.printf("%c ", alpha-3); //100-97
        System.out.printf("%c ", alpha-2);
        System.out.printf("%c ", alpha-1);
        System.out.printf("%c ", alpha-0);
         */

        for (int i = 97; i <= (int) alpha; i++) {
            int a = alpha - i;

            System.out.printf("%c ", alpha-a);

        }



    }
}

