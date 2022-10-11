package challenges.codeUp.to1050;

import java.util.Scanner;

public class Main1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String [] token = new String[input.length()];

        for(int i = 0; i<input.length();i++){
            token[i] = String.valueOf(input.charAt(i));
            System.out.printf("\'%s\'\n",token[i]);
        }

    }
}
