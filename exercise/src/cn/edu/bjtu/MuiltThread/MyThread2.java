package cn.edu.bjtu.MuiltThread;

public class MyThread2 implements Runnable{
    private MyThread2(){

    }

    public MyThread2(String s){
        super();
    }
    @Override
    public void run(){

        //String name = getName();
        //System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
