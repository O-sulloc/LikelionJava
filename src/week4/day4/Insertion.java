package week4.day4;

import java.util.Arrays;

public class Insertion {
    public int[] sort(int[] arr) {
        //매개 변수로 arr배열을 받고 리턴할 것임.
        //arr을 오름차순으로 정렬하는 메서드를 만들 것.

        int i = 1;
        int temp = 0;
        if (arr[i] < arr[i - 1]) { //5<8 작으면 swap
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }


        return arr;
    }

    public static void main(String[] args) {
        //5ㅇㅔ서 출발
        int[] arr = {8, 5, 6, 2, 4};
        Insertion is = new Insertion();
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
