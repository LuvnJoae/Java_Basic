package Buffered;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try (
                BufferedInputStream bfis =  new BufferedInputStream( new FileInputStream("D:\\JDK JRE JVM.PNG"));
                BufferedOutputStream bfos = new BufferedOutputStream( new FileOutputStream("jdk.png"));
        ) {
            int b;
            while( (b = bfis.read()) != -1){
                bfos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
