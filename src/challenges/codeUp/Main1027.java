package challenges.codeUp;

import java.util.Scanner;

public class Main1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] date = input.split("[.]");
        int[] number = new int[3];
        for(int i = 0;i< date.length;i++) {
            number[i] = Integer.parseInt(date[i]);
        }
        System.out.printf("%02d-%02d-%02d",number[2],number[1],number[0]);
    }
}
