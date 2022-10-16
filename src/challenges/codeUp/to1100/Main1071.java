package challenges.codeUp.to1100;

import java.util.Scanner;

public class Main1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int a = sc.nextInt();

            if(a != 0){
                System.out.println(a);
            }else{
                sc.close();
                break;
            }
        }

        }
    }

