package String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请瞎几把随便输：");
        String str = sc.next();

        int a = 0, b = 0, c = 0, d = 0;

        char[] arrayChar = str.toCharArray();

//        下面的这个for循环里的比较，其实可以不用ASCII码，直接用
//        字符代替就可以，比如
//        if ((arrayChar[i] >= 'A') && (arrayChar[i] <= 'Z'))

        for (int i = 0; i < arrayChar.length; i++) {
            if ((arrayChar[i] >= 65) && (arrayChar[i] <= 91)) {
                a++;
            } else if ((arrayChar[i] >= 97) && (arrayChar[i] <= 122)) {
                b++;
            } else if ((arrayChar[i] >= 48) && (arrayChar[i] <= 57)) {
                c++;
            } else
                d++;
        }
        System.out.println("大写字母有："+ a + "个");
        System.out.println("小写字母有："+ b + "个");
        System.out.println("数数字字有："+ c + "个");
        System.out.println("其其他他有："+ d + "个");
    }
}
