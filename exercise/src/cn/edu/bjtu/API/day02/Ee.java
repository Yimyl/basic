package cn.edu.bjtu.API.day02;

public class Ee {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("zzj");
        Object obj = gc.getName();
        gc.method(10);
        gc.method(8.8);
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(123);
        System.out.println(gc2.getName());
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("asd");
        String s = gc3.getName();
        System.out.println(s);


    }
}
