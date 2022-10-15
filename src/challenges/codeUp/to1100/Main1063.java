package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a<b?a:b)<c?a:c);
    }
}
