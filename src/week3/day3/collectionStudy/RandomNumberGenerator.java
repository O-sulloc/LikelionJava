package week3.day3.collectionStudy;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public int generate(int num) {
        return (int) (Math.random() * num);
    }
}
