package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("a.txt"));
        Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            System.out.println(pro.getProperty(s));
        }
    }
}
