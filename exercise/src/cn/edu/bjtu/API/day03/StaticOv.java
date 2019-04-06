package cn.edu.bjtu.API.day03;

public class StaticOv extends StaticMe {
    private void m(){
        System.out.println("Ov");
    }
//    public void mm(){//创建对象后父类该方法在堆中指向子类mm
//        m();//父类的mm中调用的是父类
//
//    }
    public void mmm(){
        m();
    }
}
