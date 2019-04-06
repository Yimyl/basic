package cn.edu.bjtu.API.day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Demo03 {
    public static void main(String[] args) throws ParseException {
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = datef.parse("1999-35");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{

        }
        Date date = datef.parse("1999-35");
        method1(new int[5],3);
    }
    public static void method1(int[] arr,int index){
        if(arr == null){
            throw new NullPointerException("空指针异常！");
        }else if(index <0 ||index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("sb");
        }else{
            System.out.println(arr[index]);
        }
    }
}
