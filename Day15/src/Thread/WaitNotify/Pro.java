package Thread.WaitNotify;

public class Pro extends Thread{
    private Baozi bz;

    public Pro(String name, Baozi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
           synchronized (bz){
               if (bz.flag == true){
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

               System.out.println("正在做包子");
               if (count % 2 == 0){
                   bz.setPier("薄皮");
                   bz.setXianer("肉");
               }else {
                   bz.setPier("厚皮");
                   bz.setXianer("蔬菜");
               }
               count++;

               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               bz.flag = true;
               bz.notify();

               System.out.println("包子好啦，吃吧");


           }
        }
    }
}
