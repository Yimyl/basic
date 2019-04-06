package cn.edu.bjtu.day10;

public interface MyInterfaceB {
    public abstract void mmm(int num);
    public default void nnn(){
        System.out.println("MyInterfaceB");
    }
}
