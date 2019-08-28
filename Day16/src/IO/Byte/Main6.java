package IO.Byte;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JDK JRE JVM.PNG");
        FileOutputStream fos = new FileOutputStream("a.png");

        byte[] bytes = new byte[1024];
        int len;
        while ( ( len = fis.read(bytes) ) != -1 ){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();

    }
}
