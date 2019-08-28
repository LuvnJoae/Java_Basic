package Thread;

public class RunnableIm implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程执行！ " + i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
