package cn.edu.bjtu.day10;

public class Mouse implements Usb{
    public void click(){
        System.out.println("click");
    }

    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");
    }
}
