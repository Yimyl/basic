package cn.edu.bjtu.day11;

public class MyInterfaceImpl implements MyInterface {
    int num = 10;
    public MyInterfaceImpl(){
        super();
    }
    @Override
    public void method() {
        System.out.println("实现了覆盖重写");
    }
}
