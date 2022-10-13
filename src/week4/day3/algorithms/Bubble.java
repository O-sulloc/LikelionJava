package week4.day3.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public int[] sort(int arr[]) {
        int temp = 0;
        for(int i=0; i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i]; //temp = 7
                    arr[i] = arr[j];// 7 = 2
                    arr[j] = temp; //2 = 7
                }
            }
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
