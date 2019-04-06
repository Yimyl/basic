package cn.edu.bjtu.day09;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        Manager o1 = new Manager(100,"zzj");
        Person p1 = new Person(100,"cw");
        Person p2 = new Person(30,"cj");
        ArrayList<Integer> list = o1.send(50,3);
        o1.show();
        //System.out.println(o1.getBalance());
        p1.receive(list);
        p1.show();
    }

}
