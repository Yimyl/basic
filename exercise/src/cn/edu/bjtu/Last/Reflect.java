package cn.edu.bjtu.Last;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class personClass = Person.class;
        Field f = personClass.getField("num");
        //Method method = personClass.getMethod("getA");

        f.set(null,5);
        System.out.println(f.get(null));
    }
    public static void construct() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class personClass = Person.class;
        Constructor c =personClass.getConstructor();
        Object p = c.newInstance();
        System.out.println(p);
        Constructor c3 = personClass.getConstructor(int.class,String.class,String.class);
        Constructor c2 = personClass.getConstructor(int.class,String.class);
        Object zzj = c2.newInstance(15,"zzj");
        System.out.println(zzj);
    }
    public static void  field(){

//        Person p = new Person();
//        Field[] fields = personClass.getFields();
//          Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

//        Field f = personClass.getField("age");
//        Field f = personClass.getDeclaredField("a");
//        f.setAccessible(true);//暴力反射
//        Object o = f.get(p);
//        System.out.println(o);
//        f.set(p,"465");
//        System.out.println(p.getA());
    }
}
