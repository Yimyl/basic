package cn.edu.bjtu.MuiltThread;

public class Consumer extends Thread{
    String name;
    private Production p;
    public Consumer(String s,Production production){
        name = s;
        p = production;
    }

    public void run(){
        Production pro;
        while(true) {
            synchronized (p) {
                if ((pro = p.get()) != null) {
                    System.out.println(name + "在吃" + pro.kind + pro.color);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("-----------------------");
                    p.notify();
                } else {
                    System.out.println(name+p.size() + "个货");
                    System.out.println("老板上货。");
                    p.notify();
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
