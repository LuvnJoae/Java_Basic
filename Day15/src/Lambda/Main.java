package Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Person("A",18),
                new Person("B",15),
                new Person("D",21)
        };

//使用Lambda表达式
        Arrays.sort(people, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });
//传统写法
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });


    }

}
