package cn.edu.bjtu.day10;

import java.util.HashMap;
import java.util.Map;

public class Demo03 {
    private static final Map<String,String> typeMap=new HashMap<String,String>();
    static
    {
        typeMap.put("java.lang.Byte", "byte");
        typeMap.put("java.lang.Short", "short");
        typeMap.put("java.lang.Integer", "intasd");
        typeMap.put("java.lang.Long", "long");
        typeMap.put("java.lang.Double", "double");
        typeMap.put("java.lang.Float", "float");
        typeMap.put("java.lang.Character", "char");
        typeMap.put("java.lang.Boolean", "boolean");
    }
    public final static <T> String getType(T t)
    {
        if(t==null){return null;}
        String typeInfo=t.getClass().getName();
        return typeMap.containsKey(typeInfo)?typeMap.get(typeInfo):typeInfo;
    }

    public static void main(String[] args) {
        Fu z = new Zi();
        //z.method();
        System.out.println(z.age);
        System.out.println(((Zi) z).age);
        System.out.println(z.num);
        System.out.println(((Zi) z).num);
        //((Zi) z).me();
    }
}
