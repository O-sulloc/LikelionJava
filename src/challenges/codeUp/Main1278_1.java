package challenges.codeUp;

import java.util.Scanner;

public class Main1278_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 2147483647; //입력받는 숫자

        int digit=(int)(Math.log10(num)+1);

        System.out.println(digit);

        int num2 = 431;
        System.out.println(Math.log10(num2));
    }
}
