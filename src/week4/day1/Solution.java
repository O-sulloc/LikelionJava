package week4.day1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*프로그래머스 자릿수 더하기
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        int sum=0;

        for (int i = 0 ; i<str.length();i++) {
            String str = String.valueOf(num);
            sum = sum + Integer.parseInt(str[i]);
        }
    }
}
