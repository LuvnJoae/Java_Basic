package IO.Char;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fw2.txt");

        char[] chars = "你是个大傻子".toCharArray();

        fw.write(chars,0,chars.length);

        fw.close();
    }
}
