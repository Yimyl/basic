package cn.edu.bjtu.JDK8.FunctionalInterface;

import java.util.function.Function;

public class FunctionMy {
    public static void main(String[] args) {
        method("123",s->Integer.parseInt(s));
    }
    public static void method(String s, Function<String,Integer> function){
        int i = function.apply(s);
        System.out.println(i);
    }
}
