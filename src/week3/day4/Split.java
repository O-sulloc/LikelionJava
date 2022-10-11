package week3.day4;

public class Split {
    public static void main(String[] args) {
        String str = "김수한무/거북이/두루미";

        String arr=str.split("/")[2];

        System.out.println(arr);
    }
}
