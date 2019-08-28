package Static;

public class Demo1Student {
    private String name;
    private int age;
    static String room;

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Demo1Student.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo1Student() {

    }

    public Demo1Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Demo1Student(String name, int age, String room) {

        this.name = name;
        this.age = age;
        this.room = room;
    }
}
