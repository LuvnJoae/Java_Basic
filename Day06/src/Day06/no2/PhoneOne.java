package Day06.no2;

/*
属性： 品牌、价格、颜色
行为：打电话、发短息

 */
public class PhoneOne {

    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给 " + who + " 打电话");
    }

    public void send(String who){
        System.out.println("给 " + who + " 发短信");
    }

    public void sendAll(){
        System.out.println("群发短信");
    }
}
