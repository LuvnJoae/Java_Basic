package Thread.Security;

public class Main {
    public static void main(String[] args) {
        Runnable run1 = new RunnableIm2();
        Thread th1 = new Thread(run1);
        Thread th2 = new Thread(run1);
        Thread th3 = new Thread(run1);

        th1.start();
        th2.start();
        th3.start();
    }

}
