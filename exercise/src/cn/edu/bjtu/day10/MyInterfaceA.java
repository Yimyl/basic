package cn.edu.bjtu.day10;

public interface MyInterfaceA {

    public static void setNum(){
    }
    public abstract void mmm();
    public default void nnn(){
        System.out.println("MyInterfaceA");
    }
}
