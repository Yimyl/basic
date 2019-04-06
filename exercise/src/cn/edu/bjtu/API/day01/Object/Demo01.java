package cn.edu.bjtu.API.day01.Object;

import java.util.Objects;

public class Demo01 {
    public static void main(String[] args) {
        Person p = new Person("zzj");
        Person p1 = new Person("zzj");
        Person p2 = new Person("zjn");
        //System.out.println(p.name.hashCode() == p1.name.hashCode());
        //System.out.println(p);
        //System.out.println(p.equals(p1));
        //System.out.println(p1.equals(p2));
        //String s = new String();//"zz";
        System.out.println(Objects.equals(p,p1));
        String s1= "abc";
        char[] b= new char[]{'a','b','c'};
        String s2 = new String(b);
        System.out.println(s2);
        System.out.println(s1 == s2);
        String s3 = "abc";
        System.out.println(s1 == s3);

        //System.out.println(s3.hashCode());
        System.out.println(Objects.equals(s1,s2));
    }
}
