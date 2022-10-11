package challenges.codeUp.to1050;

import java.util.Scanner;

public class Main1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int numOctal = Integer.parseInt(input,8);
        //입력받은걸 8진수로 바꿔줘. Integer 클래스 쓰면 돼

        System.out.printf("%d", numOctal);
    }
}
