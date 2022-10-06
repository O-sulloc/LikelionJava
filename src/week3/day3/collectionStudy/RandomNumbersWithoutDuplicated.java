package week3.day3.collectionStudy;

import java.util.HashSet;

public class RandomNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator RNG = new RandomNumberGenerator();
        HashSet<Integer> numbers = new HashSet<>(); //중복제거하기

        for (int i = 0; i < 50; i++) {
            int r = RNG.generate(20);
            numbers.add(r);
        }
        System.out.println(numbers);
    }
}
