package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        ** 3 6 9 게임은?
        여러 사람이 순서를 정해 순서대로 수를 부르는 게임이다.
        만약 3, 6, 9 가 들어간 수를 자신이 불러야 하는 상황이면, 대신 "박수" 를 쳐야 한다.
        33까지 진행했다면? "짝짝"과 같이 박수를 두 번 치는 형태도 있다.
         */

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }else {
                System.out.printf("%s ", "X");
            }
        }

    }


}


