package cn.edu.bjtu.API.day03;

import java.util.*;

public class Lis {
    public static void main(String[] args) {
       teatArrayList();
    }
    public static void teatArrayList(){
        List<String> list = new ArrayList<>();
        ArrayList li = (ArrayList) list;
        list.add("asd");
        list.add(null);
        list.add("zzj");
        list.add("45");
        list.add(null);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        for(String s : list){
            System.out.println(s);
        }
        System.out.println(li.remove("zz"));
    }
    public static void teatLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.addFirst("b");
        list.addLast("asd");
        System.out.println(list);
        list.push("www");
        list.clear();
        list.remove("zzj");

        list.get(1);
        //list.pop();
        //System.out.println(list);
//        System.out.println(list.removeFirst());
        //        System.out.println(list.removeLast());
        //        //System.out.println(list);
        System.out.println(list);
    }
    public static void teatVector(){
        Vector<String> v = new Vector<>();
        v.add("sdf");
        v.addElement("zzj");
        v.add("s");
        System.out.println(v);
        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        Iterator<String> it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
