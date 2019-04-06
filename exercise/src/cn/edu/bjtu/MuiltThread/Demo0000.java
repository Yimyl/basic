package cn.edu.bjtu.MuiltThread;

import java.util.LinkedHashSet;
import java.util.Vector;

public class Demo0000 {
    public static void main(String[] args) {
       int  count =1 ;
        for (int i = 0; i < 4; i++) {
            count%=2;
            System.out.println(count);

            count++;
            System.out.println(count);
        }


    }
}
