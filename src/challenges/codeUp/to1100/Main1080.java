package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1, 2, 3 ... 을 계속 더해 나갈 때,
        //그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
        //계속 더하는 프로그램을 작성해보자.

        int num = sc.nextInt(); //20 1~5 더하면 15고 6더하면 21로 20초과
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            sum += i;
            if (sum >= num) {
                System.out.println(i);
                break;
            }
        }
    }
}

