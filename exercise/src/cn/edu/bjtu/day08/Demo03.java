package cn.edu.bjtu.day08;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int count =0;
        for (float i  =(float) Math.ceil(-10.8); i < 5.9; i++) {
            //System.out.println(i);
            if(i>-10.8 && i <5.9 && (Math.abs(i) >6 || Math.abs(i)<2.1)){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("count:"+ count);
    }
}
