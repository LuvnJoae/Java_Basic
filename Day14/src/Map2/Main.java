package Map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if ( !map.containsKey(c) ){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        System.out.println(map);
    }
}
