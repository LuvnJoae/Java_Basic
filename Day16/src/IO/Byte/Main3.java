package IO.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

//        使用getBytes()方法，直接转换字节
        byte[] bytes = "你好呀".getBytes();

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
//        一般方式，直接写字节
        byte[] bytes1 = {67};

        fos.write(bytes);
        fos.write(bytes1);

        fos.close();
    }
}
