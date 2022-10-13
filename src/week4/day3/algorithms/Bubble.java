package week4.day3.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public int[] sort(int arr[]) {
        int temp = 0;
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            //0<6
            if (arr[i] > arr[j]) {
                temp = arr[i]; //temp = 7
                arr[i] = arr[j];// 7 = 2
                arr[j] = temp; //2 = 7
            }
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        Bubble bubble = new Bubble();
        bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
