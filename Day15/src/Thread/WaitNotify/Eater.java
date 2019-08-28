package Thread.WaitNotify;

public class Eater extends Thread {

    private Baozi bz;
    public Eater(String name, Baozi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在吃" + bz.getPier() + bz.getXianer() + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = false;
                System.out.println("包子吃完啦！还饿！");
                bz.notify();
            }

        }
    }
}
