package challenges.codeUp;

import java.util.Scanner;

public class Main1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); //입력받는 숫자
        int result =0; //몫
        int count=1; //나누기 몇 번 했는지 세는거?

        while(num/10 != 0){
            //num/10의 몫이 0이면(=num이 한자릿수면) 반복문 중단

            num = num / 10;
            //123/10=12인데 12를 num에 넣는 것임. 언제까지 나눠지나 보려고

            count++; //나눠지면 +1
        }

        System.out.println(count);
    }
}
