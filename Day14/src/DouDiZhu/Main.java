package DouDiZhu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        准备牌
        List<String> colors = List.of("♥", "♠","♣","♦");
        List<String> numbers = List.of("1","2","3","4","5", "6","7","8","9","10","J","Q","K");
        HashMap<Integer, String> map = new HashMap<>();
        Integer index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                map.put(index, color + number);
                index++;
            }
        }
        map.put(index, "大王");
        map.put(index + 1, "小王");
        ArrayList<Integer> pokerIndex = new ArrayList<>(map.keySet());
        System.out.println(pokerIndex);
//        洗牌
        Collections.shuffle(pokerIndex);
//        发牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i > 51){
                diPai.add(in);
            }
            else if (i % 3 == 0){
                player1.add(in);
            }else if (i % 3 == 1){
                player2.add(in);
            }else if (i % 3 == 2){
                player3.add(in);
            }
        }
//        排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);
//        看牌
        show("玩家1",map,player1);
        show("玩家2",map,player2);
        show("玩家3",map,player3);
        show("底牌",map,diPai);

    }

    public static void show(String str, HashMap<Integer, String> map, ArrayList<Integer> list){
        System.out.println(str + "的牌是：");
        for (Integer integer : list) {
            System.out.print(map.get(integer) + " ");
        }
        System.out.println();
    }
}
