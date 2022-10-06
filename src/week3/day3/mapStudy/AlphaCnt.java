package week3.day3.mapStudy;

import java.util.HashMap;

public class AlphaCnt {

    //2. alArr에 있는게 알파벳인지 아닌지 확인해보는 function 만들기
    static boolean isAlphabet ( char ch){
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static void main(String[] args) {
        //알파벳 세기

        //1. 스트링을 한 글자씩 출력
        String input = "abc@#dfda#$efg;;po0765".toUpperCase();

        //char[] alArr = new char[input.length()];

        //int cnt = 0; //알파벳 개수 들어갈 변수

        HashMap<Character, Integer> alphaMap = new HashMap<>();

        for(char c = 'A'; c < 'Z' ; c++){
            alphaMap.put(c,0);
        }


        for (int i = 0; i < input.length(); i++) {
            //alArr[i] = al.charAt(i);
            //System.out.println(alArr[i]);

            char c = input.charAt(i);
            boolean isAlphabet = AlphaCnt.isAlphabet(c);
            if(isAlphabet){
                alphaMap.put(c, alphaMap.get(c)+1);
            }
        }
        System.out.println(alphaMap);
    }
}
