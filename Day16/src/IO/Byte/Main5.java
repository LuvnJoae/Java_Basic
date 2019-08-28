package IO.Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int len;
        byte[] bytes = new byte[2];

        len = fis.read(bytes);
        System.out.println(len);

        len = fis.read(bytes);
        System.out.println(len);

        len = fis.read(bytes);
        System.out.println(len);

        len = fis.read(bytes);
        System.out.println(len);
        fis.close();
    }
}
