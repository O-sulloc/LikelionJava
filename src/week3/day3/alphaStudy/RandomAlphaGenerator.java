package week3.day3.alphaStudy;

public class RandomAlphaGenerator {
    public char generator() {
        int num =(int)(Math.random() * 25)+65;
        char randomAlpha = (char) num;
        return randomAlpha;
    }
}
