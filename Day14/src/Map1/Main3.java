package Map1;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(6,"A");
        map.put(9,"s");
        map.put(65,"c");
        map.put(5,"a");
        map.put(2,"q");
        ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

    }
}
