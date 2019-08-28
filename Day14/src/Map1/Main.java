package Map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        show();
        show2();


    }
    public static void show(){
        Map<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",19));
        map.put("上海",new Person("李四",29));
        map.put("深圳",new Person("王五",39));

        Set<String> set = map.keySet();
        for (String key : set){
            Person value = map.get(key);
            System.out.println(key + value.getAge() + value.getName());
        }

    }

    public static void show2(){
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("张三",19), "北京");
        map.put(new Person("李四",19), "上海");
        map.put(new Person("王五",19), "深圳");

        Set<Person> set = map.keySet();
        for (Person key : set){
            String value = map.get(key);
            System.out.println(key.getAge() + key.getName() + value);
        }


    }
}
