package cn.edu.bjtu.day10;

public class Demo01 {
    public static void main(String[] args) {
        MyInterfaceAbsImpl impl = new MyInterfaceAbsImpl();
        impl.method();
        impl.defaultMrthod();
        MyInterfaceAbs.staticMethod();
    }
}
