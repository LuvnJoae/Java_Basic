package Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) throws IOException {
//      创建Properties对象
        Properties pro = new Properties();
//        添加键值
        pro.setProperty("r","A");
        pro.setProperty("b","B");
        pro.setProperty("c","C");
//        写出
        pro.store(new FileOutputStream("a.txt",true),"");


    }
}
