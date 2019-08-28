package IO;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fw1.txt");

        fw.write(97);
        fw.flush();
        fw.write('a');
        fw.flush();
        fw.write('b');

//        fw.close();
    }
}
