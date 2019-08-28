package Collections;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",4);
        map.put("c",3);
        map.put("d",2);
        System.out.println(map);

// 先创建map.entrySet，再给ArrayList。
//        ArratList可以使用有参的构造方法，把Set放进去就可以
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return 0;
            }
        });

// 直接用ArrayList，构造方法里写map.entrySet，其实和上面的一样，省略了再创建一个Set集合的步骤
        ArrayList<Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());
        Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return 0;
            }
        });




    }
}
