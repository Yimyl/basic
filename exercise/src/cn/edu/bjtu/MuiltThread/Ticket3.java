package cn.edu.bjtu.MuiltThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket3 implements Runnable {
    private int ticket = 100;
    Object obj = new Object();
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                l.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "ticket:" + ticket);
                    ticket--;
                }
            }finally {
                l.unlock();
            }
        }
    }
}
