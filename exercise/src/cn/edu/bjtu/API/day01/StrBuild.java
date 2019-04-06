package cn.edu.bjtu.API.day01;

public class StrBuild {
    public static void main(String[] args) {
        toStrBuild();
    }
    public static void toStr(){
        StringBuilder sb = new StringBuilder("asdf565s-");
        String s=sb.toString();
        System.out.println(s);
    }
    public static void toStrBuild(){
        String s1= "ss1";
        String s2 = "ss2";
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s2);
        System.out.println(sb1);
        System.out.println(sb2);
    }
    public static void method1(){
        StringBuilder s =  new StringBuilder();
        s.append(85);
        String s1 = s.toString();
        System.out.println(s1);
        System.out.println(s1.length());
    }
    static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {
            d = 0;
            x = -x;
        }
        int p = -10;
        for (int i = 1; i < 10; i++) {
            if (x > p)
                return i + d;
            p = 10 * p;
        }
        return 10 + d;
    }
}
