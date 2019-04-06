package cn.edu.bjtu.API.day03;

public interface MyInterface2 extends MyInterface1{
    public abstract void m3();
    public default double m2(){
        System.out.println("asdf");
        return 2.0;
    }

}
