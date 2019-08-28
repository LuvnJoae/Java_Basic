package calendar;

import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int[] dest = new int[]{6,7,8,9,10};
        int[] src = new int[]{1,2,3,4,5};
        System.arraycopy(src,0,dest,0,3);
        for (int i = 0; i < 5; i++) {
            System.out.println(dest[i]);
        }
        System.out.println(Arrays.toString(dest));
    }

}
