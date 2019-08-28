package InputStreamReader;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("sort.txt"), "GBK");
        int read;
        while ( ( read = inputStreamReader.read() ) != -1 ){
            System.out.print((char)read);
        }
        inputStreamReader.close();
    }
}
