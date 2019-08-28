package InterClass;

public class Main {
    public static void main(String[] args) {
        Interface inter = new Interface(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现！");
            }
        };
        inter.method();


    }
}
