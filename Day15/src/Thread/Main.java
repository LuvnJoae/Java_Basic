package Thread;

import java.lang.Thread;
public class Main {
    public static void main(String[] args) {
//        new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(123);
//            }
//        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "a" + i);
                }
            }
        }).start();

//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println(Thread.currentThread().getName() + "b" + i);
//                }
//            }
//        }.start();





    }
}
