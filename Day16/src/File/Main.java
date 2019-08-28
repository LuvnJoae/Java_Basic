package File;



import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\Example");
        String[] str = file1.list();
        for (String s : str) {
            System.out.println(s);
        }
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
