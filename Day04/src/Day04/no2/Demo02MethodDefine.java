package Day04.no2;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        int[] arrayA = new int[]{ 1,2,3,4,5 };
        int min = 0, max = arrayA.length - 1;
        for ( ; min < max ; min++ ,max--){
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

    }
}

