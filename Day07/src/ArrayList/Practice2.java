package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student stu1 = new Student("1",2);
        Student stu2 = new Student("2",2);
        Student stu3 = new Student("3",3);
        Student stu4 = new Student("4",4);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getName() + student.getAge());
        }
    }
}
