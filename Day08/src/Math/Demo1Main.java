package Math;

public class Demo1Main {
    public static void main(String[] args) {
        int count = 0;
        for (double i = -10.8; i <= 5.9 ; i++) {
            double abs = Math.abs(i);
            if ((Math.floor(abs) < 2.1) || (Math.floor(abs) > 6)) {
                count++;
                System.out.println(Math.floor(abs));
            }
        }
        System.out.println(count);
    }
}
