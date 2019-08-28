package Multi;

public class NotePad {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("电脑关机");
    }

//使用USB设备的方法，使用接口，作为方法的参数（注意，这并不是实现类）
    public void useDevice(USB usb){
        usb.open();
        if( usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();
    }


}
