package Random;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Random r = new Random();
        int num1 = r.nextInt(100)+1;
//        System.out.println(num1);

        Scanner sc = new Scanner(System.in);
        System.out.println("小心哦，你只有10次机会");

        for (int i = 0; i < 10; i++) {
            System.out.println("还有" + (10-i) + "次机会， " + "请输入数字：");
            int num2 = sc.nextInt();

            if( num2 > num1 ){
                if( tiaoChu(i) == 1 ) break;
                System.out.println("太大了！请重试！");
            }
            else if( num2 < num1 ){
                if( tiaoChu(i) == 1 ) break;
                System.out.println("太小了！请重试！");
            }
            else if ( num1 == num2 ){
                if( tiaoChu(i) == 1 ) break;
                System.out.println("猜对啦！！");
                break;
            }
            else {
                if( tiaoChu(i) == 1 ) break;
                System.out.println("输入错误！请重试！");
                continue;
            }
        }
//        System.out.println("我终于猜对了！！！");

    }

    public static int tiaoChu(int i){
        if ( (10-i) == 1 ){
            System.out.println("你没机会咯！");
            return 1;
        }
        return 0;
    }
}
