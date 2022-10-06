package challenges.codeUp;

import java.util.Scanner;

public class Main1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] split = new int[5];
        int[] num = {10000,1000,100,10,1};


        for (int i = 0; i < split.length; i++) {
            split[i] = (input / num[i]) * num[i];
            input -= split[i];
            System.out.printf("[%d]\n",split[i]);
        }
    }
}
