package StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("asd").append("2315").append(23);
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
