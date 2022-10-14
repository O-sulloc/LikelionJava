package week4.day4;

import java.util.Arrays;

public class Insertion {
    public int[] sort(int[] arr) {
        //매개 변수로 arr배열을 받고 리턴할 것임.
        //arr을 오름차순으로 정렬하는 메서드를 만들 것.

        //int i = 1; //2번째 인덱스부터 조회한다는거
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                //System.out.printf("i:%d, j:%d, j-1:%d\n", i, j, j - 1);
                if (arr[j] < arr[j - 1]) { //5<8 작으면 swap
                    temp = arr[j - 1]; //temp에 8 넣고
                    arr[j - 1] = arr[j]; //첫번째 인덱스에 5 넣고
                    arr[j] = temp; //두번째 인덱스에 8 넣고
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        //숫자 5부터 출발
        int[] arr = {8, 5, 6, 2, 4};

        Insertion is = new Insertion();

        //int[] arr = {5, 8, 6, 2, 4};
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
