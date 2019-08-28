package Static;

public class Demo1Main {
    public static void main(String[] args) {
        Demo1Student one = new Demo1Student("郭靖",19,"101");
        Demo1Student.room = "12120";
        System.out.println(one.getAge() + one.getName() + one.room);

        Demo1Student two = new Demo1Student("黄蓉",20);

        System.out.println(two.getAge() + two.getName() + two.room);



    }
}
