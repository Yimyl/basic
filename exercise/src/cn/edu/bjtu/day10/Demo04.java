package cn.edu.bjtu.day10;

public class Demo04 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.age);
        Zi z = (Zi) f;
        z.change();
        System.out.println(z.age);
    }
}
