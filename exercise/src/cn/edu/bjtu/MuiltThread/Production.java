package cn.edu.bjtu.MuiltThread;

import java.util.LinkedList;

public class Production {
    String kind;
    String color;
    boolean empty=false;
    boolean full = false;

    public Production(LinkedList linkedList){
        list = linkedList;
    }

    public Production(int i){
        if(i==1){
            kind = "小笼包子";
            color = "白的";
        }else{
            kind = "可乐";
            color = "黑的";
        }

    }

    LinkedList<Production> list;
    public  boolean add(Production p){
        if(list.size() >= 10){
            System.out.println("货架满了，"+p.kind+p.color+"滞留");
            return false;
        }
        list.add(p);
        return true;
    }

    public  Production get(){
        Production p = null;
        if(list.size()>0){
            p = list.removeFirst();
        }
        return p;
    }

    public int size(){
        return list.size();
    }
}
