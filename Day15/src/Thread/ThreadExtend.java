package Thread;

public class ThreadExtend extends Thread{

    public ThreadExtend() {
    }

//有参构造，定义线程的名称
    public ThreadExtend(String name) {

        super(name);
    }



    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println( Thread.currentThread().getName() + i);
        }
    }
}
