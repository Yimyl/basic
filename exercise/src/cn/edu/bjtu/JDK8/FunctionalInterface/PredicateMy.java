package cn.edu.bjtu.JDK8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateMy {
    public static void main(String[] args) {
        method("zzj", name->name.equals("zjn"));

    }

    public static void method(String s, Predicate<String> p){
        boolean b = p.test(s);
        System.out.println(b);
    }

}
