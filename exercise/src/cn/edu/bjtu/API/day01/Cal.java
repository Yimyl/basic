package cn.edu.bjtu.API.day01;

import cn.edu.bjtu.Last.Anno;

import java.util.Calendar;

public class Cal {
    //@Anno
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int i = calendar.get(7);
        System.out.println(i);
    }
}
