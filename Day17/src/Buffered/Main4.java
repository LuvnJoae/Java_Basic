package Buffered;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new FileReader("practice.txt"));
        BufferedWriter bW = new BufferedWriter(new FileWriter("sort2.txt"));


        HashMap<String,String> line = new HashMap<>();

        String str = null;
        while ( ( str = bR.readLine()) != null){
            String[] strs = str.split("\\.");
            line.put(strs[0],strs[1]);
        }
        bR.close();

        //        简便方法
        for (int i = 1; i <= line.size(); i++) {
            String key = String.valueOf(i);
            String value = line.get(key);

            bW.write(key + "." + value);
            bW.newLine();
        }
/* 用一般的Map排序方法
        ArrayList<Map.Entry<String, String>> list = new ArrayList<>(line.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return Integer.valueOf(o1.getKey()) - Integer.valueOf(o2.getKey());
            }
        });

        Set<String> keySet = line.keySet();
        for (String s : keySet) {
            bW.write(s + "." + line.get(s));
            bW.newLine();
        }
*/

        bW.close();
    }
}
