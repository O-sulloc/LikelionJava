package week3.day3.alphaStudy;

import java.util.HashSet;
import java.util.Set;

public class RandomAlpha {
    //랜덤한 알파벳 중복없이 50개 출력해보기
//    public static void main(String[] args) {
//        char[] alpha = new char[26];
//
//        for (int i = 0; i < alpha.length; i++) {
//            //A = 65 알파벳은 26개
//            int j = 65;
//            alpha[i] = (char) j;
//            j++;
//            System.out.println(alpha);
//        }

    public static void main(String[] args) {
        RandomAlphaGenerator RAG = new RandomAlphaGenerator();

        Set<Character> output = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            output.add(RAG.generator());
        }

        System.out.println(output);
    }


}

