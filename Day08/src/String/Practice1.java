package String;

public class Practice1 {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4};

        String str = fromArrayToString(arrayInt);
        System.out.println(str);


    }

    public static String fromArrayToString(int[] arrayInt){
        String str = "[";
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1){
                str += "word" + arrayInt[i] + "]";
            }
            else {
                str += "word" + arrayInt[i] + "#";
            }
        }
        return str;
    }
}
