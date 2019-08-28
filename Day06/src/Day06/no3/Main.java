package Day06.no3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("鹿晗");
        person.setAge(30);
        person.setMale(true);

        System.out.println("姓名：" + person.getName());
        System.out.println("年龄:" + person.getAge());
        System.out.println("是否爷们：" + person.isMale());
    }
}
