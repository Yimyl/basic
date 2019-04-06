package cn.edu.bjtu.day11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Random r =new Random();
        byte b = 5;
        b+= Math.floor(b);
        int[] n;
        String s = "123456789";
        String[] s1 = s.split("3",5);
        System.out.println(s1.length);
        System.out.println(s.replace('5','4'));
    }
    public static void method(){
        System.out.println("sfa");
    }
}
