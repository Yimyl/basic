package cn.edu.bjtu.day10;

public class DemoUse {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Keyboard k = new Keyboard();
        Laptop l = new Laptop();
        l.start();
        l.setDevice1(m);
        l.useDevice1();
        l.setDevice1(null);
        l.useDevice1();
        l.setDevice2(k);
        l.useDevice2();
        l.shutdown();
    }
}
