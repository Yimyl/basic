package cn.edu.bjtu.MuiltThread;

import java.util.Map;

public class Demo01 {
    static MyThread  m= new MyThread(){
        @Override
        public void run(){
            System.out.println("nice");
        }
        public void method(){
            super.run();
        }

    };

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        MyThread t1= new MyThread("zzj");
//        t1.start();
//        MyThread2 t2= new MyThread2("s");
//        new Thread(t2,"hehe").start() ;
        m.run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("ss");
                }

            }
        },"zzj").start();
        for (int i = 0; i < 20; i++) {
            System.out.println("zz");
        }
        //((MyThread) m).run();
    }
}
