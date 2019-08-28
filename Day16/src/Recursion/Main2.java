package Recursion;

public class Main2 {
    public static void main(String[] args) {
        int n = JC(10);
        System.out.println(n);
    }

    private static int JC(int n) {
        if (n == 1){
            return 1;
        }
        return n * JC(n-1);
    }
}
