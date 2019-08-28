package Buffered;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"))) {

            String str= null;
            while  ( ( str = bufferedReader.readLine() ) != null ){
                System.out.println(str);
                System.out.println("--------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
