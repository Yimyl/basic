package cn.edu.bjtu.day7;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if("quit".equalsIgnoreCase(s))break;
            query(s.toCharArray());
        }
    }

    private static void query(char[] s) {
        int A = 0;
        int a =0;
        int num =0;
        int oth = 0;
        for (int i = 0; i < s.length; i++) {
            char ch = s[i];
            if(ch>='0' && ch <='9'){
                num++;
            } else if ('A' <= ch && ch <= 'Z') {
                A++;
            }else if('a' <= ch && ch <= 'z'){
                a++;
            }else{
                oth++;
            }
        }

        System.out.println("A:"+A);
        System.out.println("a:"+a);
        System.out.println("num:"+ num);
        System.out.println("other:" + oth);
    }
}
