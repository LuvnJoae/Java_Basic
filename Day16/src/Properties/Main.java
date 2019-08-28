package Properties;

import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        创建属性集对象
        Properties pro = new Properties();
//        添加键值元素
        pro.setProperty("a","A");
        pro.setProperty("b","B");
        pro.setProperty("c","C");
        pro.setProperty("d","D");
        pro.setProperty("e","E");
//        打印 属性集 对象
        System.out.println(pro);
//        通过键，获取值
        System.out.println(pro.getProperty("b"));
        System.out.println(pro.getProperty("c"));
        System.out.println(pro.getProperty("d"));
//        遍历属性集
        Set<String> strings = pro.stringPropertyNames();
        for (String string : strings) {
            System.out.println(pro.getProperty(string));
        }

    }
}
