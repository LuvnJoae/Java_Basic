import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        while (true){
            int m=0;
            int n=0;
            int s=0;

            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();
            n=sc.nextInt();

            s=m+n;

            System.out.println(s);
        }
    }
}
