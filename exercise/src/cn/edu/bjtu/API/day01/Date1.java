package cn.edu.bjtu.API.day01;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) throws ParseException {
        //System.out.println(System.currentTimeMillis());
        //method();
        birth();

    }
    public static void birth() throws ParseException {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        java.util.Date now= new java.util.Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date1 = (java.util.Date) date.parse(s);
        long pass = now.getTime()-date1.getTime();
        long day= pass / 24/3600;
        System.out.println(day+"day");

    }
    private static void method() {
        java.util.Date d= new java.util.Date();
        //System.out.println(d.getTime());
    }
    public static void dateformat() throws ParseException {
        java.util.Date d= new java.util.Date();
        //System.out.println(d.getTime());
        SimpleDateFormat date = new SimpleDateFormat("yyyy年dd日 HH时MM月mm分，ss秒");
        //String s = date.format(d);
        //System.out.println(s);
        java.util.Date dd = date.parse("2019年24日 19时03月36分，39秒");
        System.out.println(dd);
    }
}
