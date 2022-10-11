// codeUp 1021~1023
package challenges.codeUp.to1050;

import java.util.Scanner;

public class Main1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next(); //입력받음

        String[] numbers=input.split("[.]"); //[.]
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }
}