package Random;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        Random r = new Random();

        for (int i = 0; i < num1 + 1; i++) {
            int num2 = r.nextInt(num1) + 1;
            System.out.println(num2);
        }



    }
}
