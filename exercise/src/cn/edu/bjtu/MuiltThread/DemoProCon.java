package cn.edu.bjtu.MuiltThread;

import java.util.LinkedList;

public class DemoProCon {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        Production p = new Production(new LinkedList());
        Consumer c1 = new Consumer("赵政建",p);
        Consumer c2 = new Consumer("赵思达",p);
        Product p1 = new Product("王师傅",p);
        System.out.println(System.currentTimeMillis()-l);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        p1.start();
        c1.start();
        c2.start();
    }
}
