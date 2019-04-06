package cn.edu.bjtu.API.day04;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Demo02 {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        String s="zzj";
        //List<String> list = List.of("zzj",null);
        //System.out.println(list);
        List<Number> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(45.5);
        System.out.println(list2);
    }
    public static void m(List<? super Number> list){
        list.add((Number)456);
    }

}
