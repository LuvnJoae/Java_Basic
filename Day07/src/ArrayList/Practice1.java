package ArrayList;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33)+1);
        }

        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
