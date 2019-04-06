package cn.edu.bjtu.MuiltThread;

public class MyThread extends Thread{

    public MyThread(String zzj) {
        super(zzj);
    }

    public MyThread() {

    }

    @Override
    public void run(){
        System.out.println("zzj");
    }

    public void method() {
        run();

    }
}
