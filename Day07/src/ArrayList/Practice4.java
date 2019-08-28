package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Practice4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100));
            System.out.print(list.get(i) + ", ");
        }
        list1 = ouShu(list);
        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "，" );
        }
    }

    public static ArrayList<Integer> ouShu( ArrayList<Integer> list ){
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) % 2 == 0 ){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
