package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main3 {
    public static void main(String[] args) throws ParseException {
        //输入初始化
        Scanner sc = new Scanner(System.in);
        //创建 Sim类对象，并定义格式。通过parse解析，输入到Date对象date里
        SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd--HH.mm.ss");
        Date date = sdf.parse(sc.next());
        //将生日时间转换为毫秒值，将当前时间转换为毫秒值
        long birth = date.getTime();
        long now = new Date().getTime();

        System.out.println(birth);
        System.out.println(now);
        //毫秒值，转成天数，输出
        System.out.println( (now-birth)/1000/60/60/24 );



    }
}
