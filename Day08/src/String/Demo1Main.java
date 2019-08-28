package String;

public class Demo1Main {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("你好" + str1);

        char[] str2 = {'A', 'b'};
        System.out.println(str2);
//        这里其实也要加上的，不过char数组，不加也能显示储string的效果

        //注意这里，如果缺了第二行的话，就会出问题，因为，是使用
//        byte数组来创建一个对象，而byte数组本身并不是一个字符串。如果不创建
//        直接使用的话，就会输出byte的地址值。
        byte[] str3 = {97, 98};
        String string = new String(str3);
        System.out.println(string);
    }
}
