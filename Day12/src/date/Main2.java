package date;

import javax.print.DocFlavor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {
    public static void main(String[] args) throws ParseException {
        demo();
    }
    public static void demo() throws ParseException{
        SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        Date date1 = sim.parse("2019年03月18日 10时21分58秒");
        System.out.println(date1);
    }
}
