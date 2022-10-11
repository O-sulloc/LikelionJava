package week4.day1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*프로그래머스 자릿수 더하기
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
         */
        Solution sol = new Solution();
        sol.solution(1234);

    }

    public int solution(int n) { //쌤 풀이
        // % 연산 이용해서 몫과 나머지로 계산하기
        // while문

        int answer = 0; // 자릿수의 합
        int origin =0; // 이 변수로 공간복잡도가 증가함.굳이 선언하지 않아도 n을 이용해서 풀 수 있음.

        //System.out.println(n/10); //1234/10 =123
        //System.out.println(n%10); //1234%10 =4 이값을 ㄱㅖ속 반복해서 더해주면돼


        while(n>0){
            answer += n % 10;
            System.out.println("answer:" +answer);

            n = n / 10;
            System.out.println("n:" +n);
        }


        return answer;
    }

    public int solutionB(int n) { //b급 풀이
        int answer = 0;

        String str = String.valueOf(n);

        for(int i=0;i<str.length();i++){
            answer +=Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return answer;
    }
}
