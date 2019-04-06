package cn.edu.bjtu.day10;

public interface MyInterfaceAbs {
    public abstract void method();
    public default void defaultMrthod(){
        System.out.println("default");
        priDefault();
    }
    public static void staticMethod(){
        System.out.println("static");
        priStatic();
    }
    private void priDefault(){
        System.out.println("priDefault");
    }
    private static void priStatic(){
        System.out.println("priStatic");
    }
}
