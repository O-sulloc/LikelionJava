package week5.day2;

public class Square {
    public void printRectangle(int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }

    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("* ".repeat(n)); //repeat modern java style
        }
    }


    public static void main(String[] args) {
        Square s = new Square();

        //s.printSquare(4);
        s.printRectangle(2, 3);
    }
}
