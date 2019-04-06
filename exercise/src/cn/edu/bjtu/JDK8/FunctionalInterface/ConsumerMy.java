package cn.edu.bjtu.JDK8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerMy {
    public static void main(String[] args) {
        menthod("zzj",name-> System.out.println(name));
        StringBuilder s = new StringBuilder("abc");
        s.reverse();
        System.out.println(s);
    }
    public static void menthod(String name,Consumer<String> con){
        con.accept(name);
    }

}
