package cn.bjtu.edu;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {
        static String  base = "string";
        public static void main(String[] args) {
//            List<String> list = new ArrayList<String>();
//            for (int i=0;i< Integer.MAX_VALUE;i++){
//                String str = base + base;
//                base = str;
//                list.add(str.intern());
//            }
                String str3 = "java";
            String str1 = new StringBuilder("zzj").append("hh").toString();
                System.out.println(str1.intern()==str1);
                String str2 = new StringBuilder("ja").append("va").toString();
                System.out.println(str2.intern()==str3);
                //System.out.println();
        }
}
