package week5.day1;

public class Pyramid {
    public void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.printf(" "); //0이 3개
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.printStar(10);
    }
}
