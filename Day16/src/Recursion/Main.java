package Recursion;

public class Main {
    public static void main(String[] args) {
        int n = sum(100);
        System.out.println(n);
    }

    private static int sum( int n) {
//       当 n 为1 的时候，累加结束，返回true，相当于方法的出口；
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

}
