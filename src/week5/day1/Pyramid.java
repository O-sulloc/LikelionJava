package week5.day1;

public class Pyramid {
    public void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.printStar(5);


    }
}
