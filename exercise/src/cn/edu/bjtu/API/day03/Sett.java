package cn.edu.bjtu.API.day03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {

    }
    public static void testHashSet(){
        Set<Integer> set = new HashSet<>();
        Set<Equ> set2 = new HashSet<>();
        HashSet<Integer> hashSet = (HashSet<Integer>) set;
        Equ e1 = new Equ();
        Equ e2 = new Equ();
        //e2.age=10;
        System.out.println(e2.age);
        set2.add(e1);
        set2.add(e2);
        set.add(15);
        set.add(20);
        set.add(15);
        set.hashCode();
        System.out.println(set);
        System.out.println(set2);

    }
    public static void add(int...arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
