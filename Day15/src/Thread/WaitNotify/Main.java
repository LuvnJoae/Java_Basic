package Thread.WaitNotify;

public class Main {
    public static void main(String[] args) {
        Baozi bz = new Baozi();

        Eater eater = new Eater("吃货",bz);
        Pro pro = new Pro("包子铺",bz);

        eater.start();
        pro.start();
    }



}
