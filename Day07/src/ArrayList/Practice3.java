package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张1");
        list.add("张2");
        list.add("张3");
        list.add("张4");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list ){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "@" );
            if( i == (list.size()-1) ){
                System.out.print("}");
            }
        }

    }
}
