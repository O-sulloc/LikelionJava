package challenges.codeUp;

import java.util.Scanner;

public class Main1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        //16 -> 8 (hex -> octal)

        int hexNum = Integer.parseInt(input,16);

        System.out.printf("%o",hexNum);
    }
}
