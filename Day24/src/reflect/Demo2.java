package reflect;

import domain.Person;

import java.lang.reflect.Field;

public class Demo2 {
    /**
     * 1. 获取成员变量们
     * Field[] getFields() ：获取所有public修饰的成员变量
     * Field getField(String name)   获取指定名称的 public修饰的成员变量

     * Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
     * Field getDeclaredField(String name)
     2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)

     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

     4. 获取全类名
     * String getName()
     */

    public static void main(String[] args) throws Exception {
        //0. 获取Person的Class对象
        Class personClass = Person.class;

        System.out.println("\n-----1. Field[] getFields()-----");
        //1. Field[] getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
            //只能获取public修饰的成员变量，private的并不能。
        }

        System.out.println("\n------2. Field getField(String name)-----");
        //2. Field getField(String name)
        Field a = personClass.getField("a");
        //获取 成员变量 a 的值
        Person p = new Person();
        Object val = a.get(p);
        System.out.println(p);
        //设置 a 的值
        a.set(p, "newA");
        System.out.println(p);

        System.out.println("\n------3.  Field[] getDeclaredFields()------");
        //3.  Field[] getDeclaredFields()
        Field[] declaredField = personClass.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println(field);
            //可以获取所有成员变量（不管修饰符）
        }

        System.out.println("\n------4.  Field getDeclaredField(String name)------");
        //4.  Field getDeclaredField(String name)
        //这种获取方法，虽然可以获取到成员变量对象，但是对其值的操作会报错
        //需要通过 忽略安全检查 （暴力反射）来解决
        //忽略访问权限修饰符的安全检查
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);//暴力反射
        Object val2 = d.get(p);
        System.out.println(val2);


    }
}
