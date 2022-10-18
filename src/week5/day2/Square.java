package week5.day2;

public class Square {
    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Square s = new Square();

        s.printSquare(4);
    }
}
