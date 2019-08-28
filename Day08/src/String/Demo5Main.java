package String;

public class Demo5Main {
    public static void main(String[] args) {
//获取字符串的长度
        int length = "asdsadasd".length();
        System.out.println(length);
//拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("hello".concat("sadas"));
//        获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println(ch);

    }
}

