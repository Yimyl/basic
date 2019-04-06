package cn.edu.bjtu.Last;

import sun.misc.Unsafe;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Kuangjia {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties pro = new Properties();
        File f = new File("exercise\\src\\cn\\edu\\bjtu\\Last\\class.properties");
        //System.out.println(f.exists());
        //ClassLoader classLoader = Person.class.getClassLoader();
        //InputStream is = classLoader.getResourceAsStream("class.properties");
        FileInputStream is = new FileInputStream(f);
        pro.load(is);
        //pro.put("className",)
        //ObjectInputStream
        System.out.println(pro);
//        pro.put("a","b");
        String className = pro.getProperty("className");
        String methodName = (String) pro.get("methodName2");
        System.out.println(className);
        System.out.println(methodName);
        Class<?> cls = Class.forName(className);
        Constructor c =  cls.getConstructor();
        Object o = c.newInstance();
        Method method = cls.getMethod(methodName);
        System.out.println(method.invoke(o));
        //Unsafe

    }
}
