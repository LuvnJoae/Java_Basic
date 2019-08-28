package Exception;

import java.util.Scanner;

public class Main {
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        register(name);
    }

    public static void register( String name){
        for (String username : usernames) {

            if ( name.equals(username)){
                try {
                    throw new RegisterException("已被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");

    }
}
