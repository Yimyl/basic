package cn.edu.bjtu.API.day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zzj");
        coll.add("姚明");
        coll.add("黎明");
        coll.add("李明");
        //coll.remove(1);
        ArrayList list = (ArrayList)coll;
        //list.remove(1);
        System.out.println(coll);
        list.iterator();

//        for (int i = 0; i < 4; i++) {
//
//            if(i==1){
//                System.out.println(coll.remove("姚明"));
//            }
//        }
        Iterator iterator = coll.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();
        //iterator.remove();

//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }
        System.out.println(coll);
        //System.out.println(iterator.hasNext());
    }

}
