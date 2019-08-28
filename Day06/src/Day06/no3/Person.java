package Day06.no3;

public class Person {

    private String name;
    private int age;
    private boolean male;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        if (age < 100 && age > 0){
            this.age = age;
        }
        else {
            System.out.println("输入错误");
        }
    }
    public int getAge() {
        return age;

    }

    public void setMale(boolean male) {
        this.male = male;
    }
    public boolean isMale(){
        return male;
    }
}
