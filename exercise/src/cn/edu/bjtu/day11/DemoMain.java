package cn.edu.bjtu.day11;

import java.util.Random;

public class DemoMain {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
         impl.method();
         me();
        Random r = new Random();
        System.out.println(r.nextInt((int)2.1));
        MyInterface im = new MyInterface() {
            @Override
            public void method() {

            }
        };
    }
    public static void me(){
        MyInterface in1 = new MyInterface2() {
            @Override
            public void method2() {
                System.out.println(num);
                System.out.println("meth2");
            }

            @Override
            public void method() {

                System.out.println("meth");System.out.println(num);
            }
        };
        MyInterface2 in2 = new MyInterface2() {
            @Override
            public void method2() {

            }

            @Override
            public void method() {

            }
        };
        in1.method();
        System.out.println(in1.num);
        System.out.println(((MyInterface2) in1).num);
    }
}
