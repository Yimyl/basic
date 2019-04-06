package cn.edu.bjtu.MuiltThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);

    }
}
