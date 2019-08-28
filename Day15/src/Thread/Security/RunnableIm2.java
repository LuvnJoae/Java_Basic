package Thread.Security;

public class RunnableIm2 implements Runnable {
    private static int ticket = 100;
    Object lock = new Object();
    @Override
    public void run() {
        while (true){
            method();
        }
    }

    public synchronized void method(){
        if (ticket > 0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "正在卖第 "+ ticket-- +"张票");
        }
    }
}
