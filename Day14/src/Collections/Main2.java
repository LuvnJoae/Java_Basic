package Collections;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("张三",18));
        list.add(new Student("李四",28));
        list.add(new Student("王五",15));
        list.add(new Student("赵六",13));
        list.add(new Student("屠七",23));
        System.out.println(list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list);



    }
}
