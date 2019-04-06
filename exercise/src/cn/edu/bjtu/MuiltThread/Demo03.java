package cn.edu.bjtu.MuiltThread;

public class Demo03 {
    public static void main(String[] args) {
        Ticket2 t = new Ticket2();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
