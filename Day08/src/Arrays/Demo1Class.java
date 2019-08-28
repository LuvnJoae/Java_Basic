package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length - 1 ; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
