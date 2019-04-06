package cn.edu.bjtu.MuiltThread;

import java.util.concurrent.locks.ReentrantLock;

public class DemoLambda {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(() -> {
            System.out.println("这是run方法的方法体");
        }).start();
        new Runnable(){

            @Override
            public void run() {

            }
        };
    }
}
