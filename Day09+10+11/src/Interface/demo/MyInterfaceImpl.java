package Interface.demo;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("AAAAA");
    }

    @Override
    public void methodB() {
        System.out.println("BBBBB");
    }
}
