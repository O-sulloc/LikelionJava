package week5.day1;

public class Star {
    private String letter = "*";

    public Star() { //빈 생성ㅇ자
    }

    public Star(String letter) {
        this.letter = letter;
    }

    public void triangle(int num) {
        //매개변수 - 몇 줄 출력할 건지

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%s", this.letter);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Star star = new Star("#");

        star.triangle(5);
    }
}
