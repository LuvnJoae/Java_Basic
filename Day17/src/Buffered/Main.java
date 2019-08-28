package Buffered;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try (
                FileInputStream fis = new FileInputStream("D:\\JDK JRE JVM.PNG");
                FileOutputStream fos = new FileOutputStream("jdk.jpg");
        ) {
            int b;
            while( (b = fis.read()) != -1){
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);



    }
}
