package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.

        int num = sc.nextInt(); //ex)5면 2+4=6
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if(i%2 ==0){
                //짝수
                sum += i;
            }
        }
        System.out.println(sum);

    }
}

