package cn.edu.bjtu.API.day03;

public class StaticMe {
    private void m(){
        System.out.println("Me");
    }
    public void mm(){//创建对象后该方法在堆中指向子类mm
        m();//父类的mm中调用的是父类方法m，子类mm调用子类m方法
    }
    public void mmmm(){
        mm();//调用子类mm方法,因为此时mm指向子类
    }
}
