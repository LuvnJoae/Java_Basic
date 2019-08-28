package object;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三",20);
        Person person1 = new Person("张三", 30);

        System.out.println( person.toString() );

//        ArrayList<String> arrayList = new ArrayList<>();
//        boolean b = person.equals(arrayList);
//        System.out.println(b);
    }
}
