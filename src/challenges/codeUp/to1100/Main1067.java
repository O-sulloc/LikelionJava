package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num > 0 ? "plus" : "minus");
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
}
