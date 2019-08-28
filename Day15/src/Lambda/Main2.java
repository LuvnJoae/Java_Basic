package Lambda;

public class Main2 {
    public static void main(String[] args) {
        invokeCalc(10, 20, (a, b) -> {
            return  a+b;
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator){
        int result = calculator.calc(a, b);
        System.out.println("结果是" + result);

    }
}

