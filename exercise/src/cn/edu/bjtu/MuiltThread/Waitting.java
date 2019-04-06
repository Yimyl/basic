package cn.edu.bjtu.MuiltThread;

public class Waitting {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(){
            @Override
            public void run(){
                while(true) {
                    synchronized (o) {
                        System.out.println("baozi");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Yummy");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o) {
                        System.out.println("haole");
                        o.notify();

                    }
                }
            }
        }.start();
    }
}
