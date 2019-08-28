package IO.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] words = { 97,98,99,100,101};

        for (byte word : words) {
            fos.write(word);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
