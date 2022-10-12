package week4.day2.babyLion;

public class Water {
    public static void main(String[] args) {
        int num = 5;
        String str = "";

        for (int i = 0; i < ((num / 2) + (num % 2)); i++) {
            str += "수";
            for (int j = 0; j < num / 2; j++) {
                str += "박";
                break;
            }
        }

        System.out.println(str);
    }
}
