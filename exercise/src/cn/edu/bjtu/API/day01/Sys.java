package cn.edu.bjtu.API.day01;

import java.util.Arrays;
import java.util.Objects;

public class Sys {
    public static void main(String[] args) {

    }
    public static void test(){
        System.out.println("child");
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            System.out.println(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-begin);
    }
    public static void cop(){
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9,10};
        System.arraycopy(num1,0,num2,1,2);
        String s = Arrays.toString(num2);
        System.out.println(s);
    }
}
