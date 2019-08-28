package Anonymous;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 普通方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

// 匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num );

// 使用一般方法传参
//        Scanner sc = new Scanner(System.in);
//        method(sc);

// 使用匿名对象来传参
//        methodGet(new Scanner(System.in));

//使用匿名对象作为方法的返回值（法1）（复杂一点）
//        Scanner sc = methodReturn();
//        int num = sc.nextInt();
//        System.out.println("输出是：" + num);

//使用匿名对象作为方法的返回值（法2）
//        int num = methodReturn().nextInt();
//        System.out.println("输出是：" + num);

//使用匿名对象作为方法的返回值（法3）
        System.out.println("输出是：" + methodReturn().nextInt());
    }

//    public static void methodGet(Scanner sc){
//        int num = sc.nextInt();
//        System.out.println("输入的是：" + num);
//    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
