package Map2;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        count();
    }

    public static void count(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if ( !map.containsKey(c) ){
                map.put( c,1 );
            }else {
                Integer count = map.get(c);
                map.put( c,++count );
            }
        }
        System.out.println(map);
    }
}
