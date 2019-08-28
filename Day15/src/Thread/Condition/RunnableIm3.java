package Thread.Condition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableIm3 implements Runnable{

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

                lock.lock();
                if (i % 10 == 0) {
                    System.out.println("----------" + i);
                }
                System.out.println(i);

            lock.unlock();

        }
    }
}
