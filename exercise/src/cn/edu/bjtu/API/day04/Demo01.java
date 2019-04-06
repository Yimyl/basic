package cn.edu.bjtu.API.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo01 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add(0,"zzj");
        list.add(0,null);
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println(list.size());
        Integer i1=1;
        Integer i2=1;
        System.out.println(i1==i2);
    }
    public void m(int...i){
        m2("as0",i);
    }
    public void m2(String s,int...i){

    }

}
