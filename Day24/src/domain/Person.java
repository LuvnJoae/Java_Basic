package domain;

public class Person {
    private String name;
    private int age;
    public String a;
    private String d;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
