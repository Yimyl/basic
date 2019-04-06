package cn.edu.bjtu.day10;

import static java.lang.Character.getType;

public class Deno02 {
    public static void main(String[] args) {
        byte b = 10;

        System.out.println(Integer.class.isInstance(b+5));
        System.out.println(Integer.class.isInstance(b));
        System.out.println(Byte.class.isInstance(b+5));

        System.out.println(Integer.class.isInstance(b));

    }
}
