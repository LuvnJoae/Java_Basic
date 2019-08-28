package ArrayList;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
//创建
        ArrayList<String > list = new ArrayList<>();

        System.out.println(list);

//添加
        list.add("小二傻");
        list.add("上灯台");
        list.add("偷油喝");
        list.add("下不来");

        System.out.println(list);
//获取
        String str1 = list.get(2);
        System.out.println(str1);
//删除
        String removeWho = list.remove(3);
//获取尺寸长度
        int listSize = list.size();
        System.out.println(listSize);


    }
}
