package cn.edu.bjtu.MuiltThread;

public class Demo04 {
    public static void main(String[] args) {
        Ticket3 t= new Ticket3();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
