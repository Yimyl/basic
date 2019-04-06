package cn.edu.bjtu.API.day01;

public class Int extends Sys{
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        String s1 = Integer.toString(5);
        System.out.println(s1);
        String s2 = 5+"";
        System.out.println(s2);
        String s3 = String.valueOf(5);
        System.out.println(s3);
        System.out.println(Integer.valueOf("985"));
        boolean b = Boolean.parseBoolean("true");
        double d = Double.valueOf("25.3");
//        float f = Float.parseFloat();
//        long l = Long.parseLong();
//        Byte.parseByte();
//        Byte.valueOf();
//        Character.valueOf();
        System.out.println(Integer.parseInt("996"));
    }

    public static class Cls{
        public static void print(){
            System.out.println("haha");
        }

    }
    public static void me(){
        Cls c= new Cls();
    }
}
