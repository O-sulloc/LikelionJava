package week4.day2.babyLion;

interface Operation {
    int operation(int a, int b);
}

public class Gugudan {

    //템플릿을 만들어서 숫자, 기호 다 매개변수로 받을 수 있게.. 더하기, 곱하기.. 다형성..
    public void temp(int dan, String operator, Operation operation) {
        //??
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d %s %d = %d\n", dan, operator, i, operation.operation(dan, i));
        }
    }

    public void plusGugu(int dan) {
        temp(dan,"+",(a,b) -> a+b);
    }

    public void multipleGugu(int dan) {
        temp(dan,"*",(a,b) -> a*b);
    }

    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();

        for (int j = 2; j <= 9; j++) {
            gugudan.multipleGugu(j);
        }
    }
}
