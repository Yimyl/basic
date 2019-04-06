package cn.edu.bjtu.day09;

import java.util.ArrayList;

public class Person extends People{
    public Person() {
    }

    public Person(int balance, String name) {
        setBalance(balance);
        setName(name);
    }

    public void receive(ArrayList<Integer> list){
        if(list.size()>0){
            int num = list.remove(0);
            setBalance(getBalance()+num);
            System.out.println("抢了"+num+"元");
        }else {
            System.out.println("抢完了");
        }

    }
}
