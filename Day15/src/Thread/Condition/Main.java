package Thread.Condition;

public class Main {
    public static void main(String[] args) {
        RunnableIm3 runnableIm3 = new RunnableIm3();
        new Thread(runnableIm3).start();
    }
}
