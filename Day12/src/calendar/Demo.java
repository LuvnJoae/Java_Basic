package calendar;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Integer[] ints = new Integer[]{ 1,8,5,7,6,2,0};
//        通过匿名类
        Arrays.sort(ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(ints));


    }

}
