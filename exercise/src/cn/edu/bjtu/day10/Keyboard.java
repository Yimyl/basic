package cn.edu.bjtu.day10;

public class Keyboard implements Usb{
    public void stick(){
        System.out.println("stick");
    }

    @Override
    public void open() {
        System.out.println("keyboard open");
    }

    @Override
    public void close() {
        System.out.println("keyboard close");
    }
}
