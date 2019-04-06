package cn.edu.bjtu.API.day03;

//public class Ov extends Me {
//    public void m(){
//        System.out.println("Ov");
//    }
//    public void mm(){//创建对象后父类该方法在堆中指向子类mm
//        super.m();//父类的mm中调用的是父类
//
//    }
////    public void mmm(){
////        m();
////    }
//
//    public static void main(String[] args) {
//        Me me = new Ov();
//        me.m();
//    }
//}
public class Ov extends Me {
    public void m(){
        System.out.println("Ov");
    }
    public void mm(){
        super.mm();
    }
    public static void main(String[] args) {
        Me me = new Ov();
        me.mm();
    }
}