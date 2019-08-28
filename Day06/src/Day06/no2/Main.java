package Day06.no2;

public class Main {
    public static void main(String[] args) {
        PhoneOne phoneOne = new PhoneOne();

        phoneOne.color = "黑色";
        phoneOne.price = 90;
        phoneOne.brand = "华为";

        demo(phoneOne);
    }

    public static void demo(PhoneOne phoneOne){
        System.out.println(phoneOne.brand);
        System.out.println(phoneOne.color);
        System.out.println(phoneOne.price);


        phoneOne.call("王力宏");
        phoneOne.send("周杰伦");
        phoneOne.sendAll();
    }
}
