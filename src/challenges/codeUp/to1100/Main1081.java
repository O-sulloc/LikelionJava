package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //1부터 n까지, 1부터 m까지 숫자가 적힌
        //서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

        //만약에 n=2, m=3
        //n=1,2 m=1,2,3 6가지 경우의 수
        //n=1일때 m=1,2,3 출력
        int a = 2;
        int b = 3;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                // 1<= 3
                System.out.printf("i:%d ",i);
                System.out.printf("j:%d",j); //1 j=2
                System.out.println();
            }
        }
    }
}

