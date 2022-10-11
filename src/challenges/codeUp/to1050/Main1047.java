package challenges.codeUp.to1050;

import java.util.Scanner;

public class Main1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //비트연산자 <<
        // 2 << 1 = 2^1
        // 2 <<2 = 2^2

        int num = sc.nextInt();

        System.out.println(num << 1);
    }
}
