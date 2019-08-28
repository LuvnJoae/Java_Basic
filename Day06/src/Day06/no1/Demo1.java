package Day06.no1;

public class Demo1 {
    public static void main(String[] args) {

        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.name = "二傻呀";
        stu.age = 22;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();
    }
}

