package reflect;

import domain.Person;

public class Demo1 {
    /**
     * 	1. Class.forName（"全类名"）：将字节码文件加载进内存，返回Class对象
            a. 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
        2. 类名.class：通过类名的属性class获取
        3. 对象.getClass（）：在Object类中定义着
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName("全类名")
        Class cls1 = Class.forName("domain.Person");
        System.out.println(cls1);

        //2. 类名.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        //3. 对象.getClass
        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);
    }
}
