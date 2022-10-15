package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] % 2 == 0 ? "even" : "odd");
        }

    }
}
