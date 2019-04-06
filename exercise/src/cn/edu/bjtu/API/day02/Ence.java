package cn.edu.bjtu.API.day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ence {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        ((ArrayList) coll).add("zzj");
        ((ArrayList) coll).add("yaoming");
        coll.add("asd");
        ((ArrayList) coll).add(213);
        System.out.println(coll.toString());
        System.out.println(((ArrayList) coll).toString());
        //ArrayList<Character> coll2 = new ArrayList<>();
        for(Object i : coll){

//            System.out.println(i instanceof String);
            //System.out.println(i);
            //coll.remove(i);
            System.out.println(i);
        }
        //System.out.println( ((ArrayList) coll));
//        int[] num = {1,5,3,7,10};
//        for(int i : num){
//            System.out.println(i);
//        }

    }
}
