package challenges.codeUp;

import java.util.Scanner;

public class Main1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 영문자 -> 아스키 10진수값으로 출력

        String input = sc.next();

        int num = input.charAt(0);

        System.out.println(num);

    }
}
