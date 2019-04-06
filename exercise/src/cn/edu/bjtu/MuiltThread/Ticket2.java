package cn.edu.bjtu.MuiltThread;

public class Ticket2 implements Runnable {
    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            method();

        }
    }
    public synchronized void method(){
        if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
            System.out.println(Thread.currentThread().getName() + "ticket:" + ticket);
            ticket--;
        }
    }
}
