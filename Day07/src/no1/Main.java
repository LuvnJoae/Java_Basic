package no1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayA = new int[3];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("请输入第" + (i+1) +"个数字");
            arrayA[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < arrayA.length; i++) {
//            if (arrayA[i] > max){
//                max = arrayA[i];
//            }
//            这一种是用if语句实现，本质都是一样的。
            max = arrayA[i] > max ? arrayA[i] : max ;

        }

        System.out.println("最大的数字是："+ max);
    }
}
