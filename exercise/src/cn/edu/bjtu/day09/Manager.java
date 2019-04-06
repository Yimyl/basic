package cn.edu.bjtu.day09;

import java.util.ArrayList;

public class Manager extends People{

    public Manager() {
    }

    public Manager(int balance, String name){
        setBalance(balance);
        setName(name);
    }

    public ArrayList<Integer> send(int money, int n){
        ArrayList<Integer> list = new ArrayList<>();
        int balance = super.getBalance();
        if(balance >= money){
            balance -= money;
            setBalance(balance);
            int avg = money / n;
            setBalance(getBalance()+money%n);
            for (int i = 0; i < n; i++) {
                list.add(avg);
            }
            System.out.println("发红包啦");
        }else {
            System.out.println("余额不足");
        }
        return list;
    }

//    public void show(){
//        super.show();
//    }
}
