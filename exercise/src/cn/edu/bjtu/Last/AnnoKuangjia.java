package cn.edu.bjtu.Last;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Anno(className = "cn.edu.bjtu.Last.Person", methodName = "getA")
public class AnnoKuangjia {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cls = Class.forName("cn.edu.bjtu.Last.AnnoKuangjia");
        Anno annotation = cls.getAnnotation(Anno.class);
        String className = annotation.className();
        String methodName = annotation.methodName();
        Class<?> person = Class.forName(className);
        Constructor con = person.getConstructor();
        Method me = person.getMethod(methodName);
        Object o = con.newInstance();
        //System.out.println(o);
        Object a = me.invoke(o);
        Person p = (Person) o;
        //System.out.println(p);
        System.out.println(a);
        p.setA("sdf");
        String a1 = p.getA();
        System.out.println(a1);
        Object a2 = me.invoke(o);
        System.out.println(a2);


    }
}
