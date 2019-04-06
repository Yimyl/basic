package cn.edu.bjtu.API.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03 {
    int age;
    String name;

    public Demo03(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo03{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Demo03> list = new ArrayList<>();
        Demo03 p1 = new Demo03(18,"zzj");
        Demo03 p2 =new Demo03(21,"zzj");
        Demo03 p3 = new Demo03(18,"cj");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Collections.sort(list,new Comparator<Demo03>(){
            @Override
            public int compare(Demo03 o1, Demo03 o2) {
                int a=o1.age-o2.age;
                return a!=0?a:o1.name.compareTo(o2.name);
            }
        }
        );
        System.out.println(list);
    }
}
