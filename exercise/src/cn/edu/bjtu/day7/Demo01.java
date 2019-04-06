package cn.edu.bjtu.day7;

import java.util.ArrayList;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getInt();
        print(list);
        print(select(list));
    }
    public static void print(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i)+"}");
            }else{
                System.out.print(list.get(i)+"@");
            }
        }
        System.out.println("");
    }
    public static ArrayList getInt(){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt());
        }
        return list;
    }
    public static ArrayList select(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            int n =(int) list.get(i);
            if( n<0 || n%2 != 0){
                System.out.println(list.remove(i));
                System.out.println(list.size());
                i--;
            }
            System.out.println(i);
        }
        return list;
    }
}
