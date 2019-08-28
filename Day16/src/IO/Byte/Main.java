package IO.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(97);
        fos.write(98);
        fos.write(3);
        fos.close();

    }
}
