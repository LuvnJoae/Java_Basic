package Multi;

public class Main {
    public static void main(String[] args) {
        //首相创建一个笔记本电脑，并开机
        NotePad notePad = new NotePad();
        notePad.powerOn();

        //使用多态写法，准备一个鼠标
        USB mouse = new Mouse();
        notePad.useDevice(mouse);



        //不使用多态写法，准备一个键盘
        KeyBoard keyBoard = new KeyBoard();
        notePad.useDevice(keyBoard);//发生了向上转型
        //这里因为K是USB的一个实现类，所以
        // 相当于范围小的自动向上转型转换为大的，所以也能够实现

        notePad.powerOff();
    }
}
