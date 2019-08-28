package DouDiZhu;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//       准备牌，定义一个存储四个花色的ArrayList集合
        ArrayList<String> huaSe = new ArrayList<>();
        huaSe.add("♠");
        huaSe.add("♥");
        huaSe.add("♦");
        huaSe.add("♣");
//      存储 数字
        ArrayList<String> xuHao = new ArrayList<>();
        xuHao.add("1");
        xuHao.add("2");
        xuHao.add("3");
        xuHao.add("4");
        xuHao.add("5");
        xuHao.add("6");
        xuHao.add("7");
        xuHao.add("8");
        xuHao.add("9");
        xuHao.add("10");
        xuHao.add("J");
        xuHao.add("Q");
        xuHao.add("K");
//通过循环嵌套，存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String > zuHe = new ArrayList<>();
        zuHe.add("大王");
        zuHe.add("小王");
        for ( String str : huaSe ){
            for (String str2 : xuHao ){
                zuHe.add(str + str2);
            }
        }
        System.out.println(zuHe);
//洗牌，通过Collections.shuffle方法打乱集合内容
        Collections.shuffle(zuHe);
        System.out.println(zuHe);
//发牌，定义四个集合，存储三个玩家的牌和底牌。
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();
//也可以用if，一样的
        for (int i = 0; i < zuHe.size() - 3; i++) {
            int num = i % 3;
            switch (num) {
                case 0:
                    p1.add(zuHe.get(i));
                    break;
                case 1:
                    p2.add(zuHe.get(i));
                    break;
                case 2:
                    p3.add(zuHe.get(i));
                    break;
                default:
                    break;
            }
        }
//        底牌
        di.add(zuHe.get(zuHe.size()-3));
        di.add(zuHe.get(zuHe.size()-2));
        di.add(zuHe.get(zuHe.size()-1));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(di);



    }
}
