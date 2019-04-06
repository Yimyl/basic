package cn.edu.bjtu.JDK8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierMe {
    public static void main(String[] args) {
//        String string = getString(() -> "asd啊");
//        System.out.println(string);
//        int[] num  ={0,-56,13,66};
//        max()
    }

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static Integer max(Supplier<Integer> sup) {
        return sup.get();
    }
}
